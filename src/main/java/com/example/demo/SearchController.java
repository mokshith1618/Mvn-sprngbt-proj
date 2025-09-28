package com.example.demo;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SearchController {

    private final CleanFoodRepository repository;

    public SearchController(CleanFoodRepository repository) {
        this.repository = repository;
    }

    // Index page: fetch top 50 foods for display
    @GetMapping("/")
    public String home(Model model) {
        List<CleanFoods> foods = repository.findTop50ByOrderByProductNameAsc();
        model.addAttribute("foods", foods);
        return "index";
    }

    // Autocomplete API: fetch top 10 matching foods
    @GetMapping("/api/search")
    @ResponseBody
    public List<CleanFoods> searchPrefix(@RequestParam String prefix) {
        return repository.findTop10ByProductNameStartingWithIgnoreCase(prefix);
    }

    // Search POST: calculate nutrient values only for selected food
    @PostMapping("/search")
    public String search(@RequestParam String food,
                         @RequestParam int days,
                         @RequestParam int quantity,
                         Model model) {

        CleanFoods f = repository.findFirstByProductName(food);

        Map<String, Double> nutrients = new LinkedHashMap<>();
        if (f != null) {
            double factor = quantity / 100.0 * days;

            // Only include non-zero Double fields
            for (Field field : CleanFoods.class.getDeclaredFields()) {
                if (field.getType() == Double.class) {
                    field.setAccessible(true);
                    try {
                        Double val = (Double) field.get(f);
                        if (val != null && val > 0) {
                            nutrients.put(field.getName(), val * factor);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        model.addAttribute("food", f);
        model.addAttribute("days", days);
        model.addAttribute("quantity", quantity);
        model.addAttribute("nutrients", nutrients);

        return "details";
    }
}

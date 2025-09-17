package com.stacktips.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "clean_foods")
public class clean_foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private Double energy100g;
    private Double energyFromFat100g;
    private Double fat100g;
    private Double saturatedFat100g;
    private Double butyricAcid100g;
    private Double caproicAcid100g;
    private Double caprylicAcid100g;
    private Double capricAcid100g;
    private Double lauricAcid100g;
    private Double myristicAcid100g;
    private Double palmiticAcid100g;
    private Double stearicAcid100g;
    private Double arachidicAcid100g;
    private Double behenicAcid100g;
    private Double lignocericAcid100g;
    private Double ceroticAcid100g;
    private Double montanicAcid100g;
    private Double melissicAcid100g;
    private Double monounsaturatedFat100g;
    private Double polyunsaturatedFat100g;
    private Double omega3Fat100g;
    private Double alphaLinolenicAcid100g;
    private Double eicosapentaenoicAcid100g;
    private Double docosahexaenoicAcid100g;
    private Double omega6Fat100g;
    private Double linoleicAcid100g;
    private Double arachidonicAcid100g;
    private Double gammaLinolenicAcid100g;
    private Double dihomoGammaLinolenicAcid100g;
    private Double omega9Fat100g;
    private Double oleicAcid100g;
    private Double elaidicAcid100g;
    private Double gondoicAcid100g;
    private Double meadAcid100g;
    private Double erucicAcid100g;
    private Double nervonicAcid100g;
    private Double transFat100g;
    private Double cholesterol100g;
    private Double carbohydrates100g;
    private Double sugars100g;
    private Double sucrose100g;
    private Double glucose100g;
    private Double fructose100g;
    private Double lactose100g;
    private Double maltose100g;
    private Double maltodextrins100g;
    private Double starch100g;
    private Double polyols100g;
    private Double fiber100g;
    private Double proteins100g;
    private Double casein100g;
    private Double serumProteins100g;
    private Double nucleotides100g;
    private Double salt100g;
    private Double sodium100g;
    private Double alcohol100g;
    private Double vitaminA100g;
    private Double betaCarotene100g;
    private Double vitaminD100g;
    private Double vitaminE100g;
    private Double vitaminK100g;
    private Double vitaminC100g;
    private Double vitaminB1100g;
    private Double vitaminB2100g;
    private Double vitaminPp100g;
    private Double vitaminB6100g;
    private Double vitaminB9100g;
    private Double folates100g;
    private Double vitaminB12100g;
    private Double biotin100g;
    private Double pantothenicAcid100g;
    private Double silica100g;
    private Double bicarbonate100g;
    private Double potassium100g;
    private Double chloride100g;
    private Double calcium100g;
    private Double phosphorus100g;
    private Double iron100g;
    private Double magnesium100g;
    private Double zinc100g;
    private Double copper100g;
    private Double manganese100g;
    private Double fluoride100g;
    private Double selenium100g;
    private Double chromium100g;
    private Double molybdenum100g;
    private Double iodine100g;
    private Double caffeine100g;
    private Double taurine100g;
    private Double ph100g;
    private Double fruitsVegetablesNuts100g;
    private Double fruitsVegetablesNutsEstimate100g;
    private Double collagenMeatProteinRatio100g;
    private Double cocoa100g;
    private Double chlorophyl100g;
    private Double carbonFootprint100g;
    private Double nutritionScoreFr100g;
    private Double nutritionScoreUk100g;
    private Double glycemicIndex100g;
    private Double waterHardness100g;

}

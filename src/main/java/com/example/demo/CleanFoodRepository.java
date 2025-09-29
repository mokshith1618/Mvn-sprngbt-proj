package com.example.demo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CleanFoodRepository extends JpaRepository<CleanFoods, Long> {

    // Fetch full food when selected
    @Query("SELECT c FROM CleanFoods c WHERE c.productName = :productName")
    CleanFoods findFirstByProductName(@Param("productName") String productName);

    // Fetch only product names for homepage (lightweight)
    @Query("SELECT c.productName FROM CleanFoods c ORDER BY c.productName ASC")
    List<String> findTop50ProductNames();

    // Autocomplete: only product names
    @Query("SELECT c.productName FROM CleanFoods c WHERE LOWER(c.productName) LIKE LOWER(CONCAT(:prefix, '%'))")
    List<String> findTop10ProductNamesByPrefix(@Param("prefix") String prefix);

    // If you ever need to stream full foods
    @Query("SELECT c FROM CleanFoods c ORDER BY c.productName ASC")
    Stream<CleanFoods> streamAllFoods();
}

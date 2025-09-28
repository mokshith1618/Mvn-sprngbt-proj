package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CleanFoodRepository extends JpaRepository<CleanFoods, Long> {
    CleanFoods findFirstByProductName(String productName);
    List<CleanFoods> findTop50ByOrderByProductNameAsc();
    List<CleanFoods> findTop10ByProductNameStartingWithIgnoreCase(String prefix);
}
package com.example.demo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CleanFoodRepository extends JpaRepository<CleanFoods, Long> {

    @Query("SELECT c FROM CleanFoods c WHERE c.productName = :productName")
    CleanFoods findFirstByProductName(@Param("productName") String productName);

    @Query("SELECT c FROM CleanFoods c ORDER BY c.productName ASC")
    List<CleanFoods> findTop50ByOrderByProductNameAsc();

    List<CleanFoods> findTop10ByProductNameStartingWithIgnoreCase(String prefix);

    @Query("SELECT c FROM CleanFoods c ORDER BY c.productName ASC")
    Stream<CleanFoods> streamAllFoods();
}

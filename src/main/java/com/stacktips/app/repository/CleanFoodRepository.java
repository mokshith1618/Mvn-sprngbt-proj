package com.stacktips.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stacktips.app.model.clean_foods;

public interface CleanFoodRepository extends JpaRepository < clean_foods, Long > {

}

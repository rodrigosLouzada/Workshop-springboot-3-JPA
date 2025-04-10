package com.testcourse.testcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcourse.testcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

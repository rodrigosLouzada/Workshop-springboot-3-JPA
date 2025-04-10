package com.testcourse.testcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcourse.testcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

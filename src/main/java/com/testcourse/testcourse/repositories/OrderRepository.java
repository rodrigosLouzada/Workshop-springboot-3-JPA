package com.testcourse.testcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcourse.testcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

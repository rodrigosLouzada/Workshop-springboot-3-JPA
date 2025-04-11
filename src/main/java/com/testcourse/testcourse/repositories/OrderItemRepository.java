package com.testcourse.testcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcourse.testcourse.entities.OrderItem;
import com.testcourse.testcourse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

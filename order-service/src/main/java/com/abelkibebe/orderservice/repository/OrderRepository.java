package com.abelkibebe.orderservice.repository;

import com.abelkibebe.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

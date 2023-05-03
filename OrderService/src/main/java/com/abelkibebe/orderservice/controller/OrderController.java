package com.abelkibebe.orderservice.controller;

import com.abelkibebe.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestMapping OrderRequest orderRequest) {
        return "Order placed Successfully";
    }
}

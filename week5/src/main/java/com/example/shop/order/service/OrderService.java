package com.example.shop.order.service;

import com.example.shop.order.dto.OrderCreateRequest;
import com.example.shop.order.entity.Order;

import java.util.List;

public interface OrderService {
    Long createOrder(OrderCreateRequest request);
    List<Order> getAllOrders();
    Order getOrderById(Long orderId);
    void cancelOrder(Long orderId);
}


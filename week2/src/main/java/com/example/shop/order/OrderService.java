package com.example.shop.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Long createOrder(OrderCreateRequest request) {
        Order order = Order.builder()
                .memberId(request.getMemberId())
                .productId(request.getProductId())
                .quantity(request.getQuantity())
                .build();
        return orderRepository.save(order).getId();
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Order not found with id: " + orderId));
    }

    public void cancelOrder(Long orderId) {
        Order order = getOrderById(orderId);
        order.cancel();
        orderRepository.save(order);
    }
}
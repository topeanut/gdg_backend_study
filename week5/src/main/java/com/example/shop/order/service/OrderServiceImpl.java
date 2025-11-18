package com.example.shop.order.service;

import com.example.shop.order.dto.OrderCreateRequest;
import com.example.shop.order.entity.Order;
import com.example.shop.order.exception.OrderNotFoundException;
import com.example.shop.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Long createOrder(OrderCreateRequest request) {
        Order order = new Order(
                request.getProductId(),
                request.getMemberId(),
                request.getQuantity()
        );
        Order saved = orderRepository.save(order);
        return saved.getId();
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("주문을 찾을 수 없습니다. ID: " + orderId));
    }

    @Override
    public void cancelOrder(Long orderId) {
        Order order = getOrderById(orderId);
        order.cancel();
        orderRepository.save(order);
    }
}


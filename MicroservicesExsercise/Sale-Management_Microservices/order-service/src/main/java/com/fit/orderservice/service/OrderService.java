package com.fit.orderservice.service;

import com.fit.orderservice.entity.Order;
import com.fit.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        order.setTotalAmount(order.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity()).sum());
        order.getItems().forEach(item -> item.setOrder(order));
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

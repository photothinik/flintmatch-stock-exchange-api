package com.flintmatch.stockexchange.api.service;

import com.flintmatch.stockexchange.api.model.Order;
import com.flintmatch.stockexchange.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        Optional<Order> result = this.orderRepository.findById(id);
        if( result.isPresent())
            return result.get();
        else
            throw new IllegalArgumentException("Unable to find stock order with id '" + id + "'");
    }

    public void save(Order order) {

        System.out.println("Order Type: |" + order.getOrderType() + "|len=" + order.getOrderType().length());

        this.orderRepository.save(order);
    }

    public void delete(Long id) {
        this.orderRepository.deleteById(id);
    }

}

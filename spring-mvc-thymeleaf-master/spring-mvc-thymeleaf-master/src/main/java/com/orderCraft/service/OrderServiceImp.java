package com.orderCraft.service;

import com.orderCraft.entity.Order;
import com.orderCraft.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    public Order saveCustomers(Order Order) {
        orderRepository.save(Order);
        return Order;
    }
    public Order getOrderById(Long idOrder){
        return orderRepository.findById(idOrder).get();
    }
    public void deleteOrder(Long idOrder){
        orderRepository.deleteById(idOrder);
    }
}

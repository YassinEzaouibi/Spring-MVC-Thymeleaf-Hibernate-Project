package com.orderCraft.service;

import com.orderCraft.entity.Order;
import com.orderCraft.entity.OrderProduct;
import com.orderCraft.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductServiceImp {
    @Autowired
    private OrderRepository orderRepository;
 /*   public List<Order> getAllOrders() {
        return orderRepository.ge();
    }
    *//*public OrderProduct saveCustomers(OrderProduct orderProduct) {
        orderRepository.save(orderProduct);
        return orderProduct;
    }
    public OrderProduct getOrderById(Long idOrder){
        return orderRepository.findById(idOrder).get();
    }*//*
    public void deleteOrder(Long idOrder){
        orderRepository.deleteById(idOrder);
    }

}*/
}

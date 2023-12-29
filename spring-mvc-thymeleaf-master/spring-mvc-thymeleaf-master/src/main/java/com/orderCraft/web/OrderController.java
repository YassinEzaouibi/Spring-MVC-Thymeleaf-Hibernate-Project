package com.orderCraft.web;

import com.orderCraft.entity.Order;
import com.orderCraft.entity.Product;
import com.orderCraft.service.OrderProductServiceImp;
import com.orderCraft.service.OrderServiceImp;
import com.orderCraft.service.ProductServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderServiceImp orderService;

    @GetMapping("list")
    public String listOrders(Model theModel) {
        List<Order> orders = orderService.getAllOrders();
        theModel.addAttribute("orders", orders);
        return "order/list-orders";
    }
}

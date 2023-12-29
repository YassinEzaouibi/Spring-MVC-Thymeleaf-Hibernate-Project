package com.orderCraft.web;


import com.orderCraft.entity.Product;
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
@RequestMapping("/products")
public class ProductController {
    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductServiceImp productService;

    @GetMapping("list")
    public String listCustomers(Model theModel) {
        List<Product> products = productService.getAllProducts();
        theModel.addAttribute("products", products);
        return "product/list-products";
    }
}

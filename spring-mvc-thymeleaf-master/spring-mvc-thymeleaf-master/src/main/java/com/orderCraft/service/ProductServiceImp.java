package com.orderCraft.service;

import com.orderCraft.entity.Product;
import com.orderCraft.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product saveCustomers(Product product) {
        productRepository.save(product);
        return product;
    }
    public Product getClientById(Long idiProduct){
        return productRepository.findById(idiProduct).get();
    }
    public void deleteProduct(Long idProduct){
        productRepository.deleteById(idProduct);
    }
}


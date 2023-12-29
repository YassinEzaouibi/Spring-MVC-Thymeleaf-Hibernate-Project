package com.orderCraft.service;

import com.orderCraft.entity.Customer;
import com.orderCraft.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {

    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Customer saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }
    public Customer getCustomertById(Long idClient){
        return customerRepository.findById(idClient).get();
    }
    public void deleteCustomer(Long idClient){
        customerRepository.deleteById(idClient);
    }

}

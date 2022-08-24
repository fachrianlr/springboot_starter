package com.rian.starter.processor.v1;

import com.rian.starter.model.v1.Customer;
import com.rian.starter.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class CustomerProcessorImpl implements CustomerProcessor {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public ArrayList<Customer> findAll() {
        ArrayList<Customer> data = customerRepository.findAll();
        return data;
    }

    @Override
    public ArrayList<Customer> findByLastName(String lastName) {
        ArrayList<Customer> data = customerRepository.findByLastName(lastName);
        return data;
    }
}

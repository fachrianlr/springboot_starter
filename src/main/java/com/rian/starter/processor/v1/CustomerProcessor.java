package com.rian.starter.processor.v1;

import com.rian.starter.model.v1.Customer;

import java.util.ArrayList;

public interface CustomerProcessor {
    ArrayList<Customer> findAll();
    ArrayList<Customer> findByLastName(String lastName);


}

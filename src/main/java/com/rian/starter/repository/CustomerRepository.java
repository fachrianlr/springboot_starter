package com.rian.starter.repository;


import java.util.ArrayList;
import com.rian.starter.model.v1.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    ArrayList<Customer> findAll();
    ArrayList<Customer> findByLastName(String lastName);
    Customer findById(long id);
}

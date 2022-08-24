package com.rian.starter.services.v1;

import com.rian.starter.model.v1.Customer;
import com.rian.starter.processor.v1.CustomerProcessorImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/rian/api/v1")
public class ServicesImpl implements Services {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    CustomerProcessorImpl customerProcessor;

    @Override
    @GetMapping(value = "/findByLastName/{lastName}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Customer> findByLastName(@PathVariable String lastName) {
        ArrayList<Customer> customerList = customerProcessor.findByLastName(lastName);

        return customerList;
    }

    @Override
    @GetMapping(value = "/findAll", produces= MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Customer> findByAll() {
        ArrayList<Customer> customerList = customerProcessor.findAll();

        return customerList;
    }
}

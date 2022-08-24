package com.rian.starter.services.v1;

import com.rian.starter.model.v1.Customer;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;

public interface Services {

    ArrayList<Customer> findByLastName(String lastName);
    ArrayList<Customer> findByAll();
}
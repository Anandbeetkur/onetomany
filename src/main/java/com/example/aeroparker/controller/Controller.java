package com.example.aeroparker.controller;

import com.example.aeroparker.Services.Service;
import com.example.aeroparker.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.Provider;
import java.util.List;
@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    private Service service;


    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer customerSaved = service.addAllCustomers(customer);
        return new ResponseEntity<Customer>(customerSaved, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers(){

        List<Customer> listOfAllEmps = service.getAllCustomers();
        return new ResponseEntity<List<Customer>>(listOfAllEmps, HttpStatus.OK);
    }
}

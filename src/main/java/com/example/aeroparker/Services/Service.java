package com.example.aeroparker.Services;

import com.example.aeroparker.customException.BException;
import com.example.aeroparker.entity.Customer;
import com.example.aeroparker.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service {

@Autowired
private  Repo repo;
    public Customer addAllCustomers(Customer customer) {
        try {
            if (customer.getFirstname().isEmpty() || customer.getFirstname().length() == 0) {
                throw new BException("601", "please send proper name");
            }
                else if(customer.getEmail().isEmpty()||customer.getEmail().length()==0) {
                throw new BException("601", "please send proper email");
            }
            Customer saveAll = repo.save(customer);
            return saveAll;
        } catch (IllegalArgumentException e) {
            throw new BException("602", "argument is empty" + e.getMessage());
        } catch (Exception e) {
            throw new BException("603", "Something went wrong" + e.getMessage());
        }

    }

    public List<Customer> getAllCustomers() {
        List<Customer> empList = Repo.findAll();
        try {
            if (empList.isEmpty()) {
                throw new BException("604", "No Data in the List");
            }
            return empList;
        } catch (Exception e) {
            throw new BException("605", " file not found exception" + e.getMessage());
        }
    }

}

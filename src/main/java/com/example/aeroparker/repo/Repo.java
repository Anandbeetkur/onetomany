package com.example.aeroparker.repo;

import com.example.aeroparker.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Customer,Long> {
}

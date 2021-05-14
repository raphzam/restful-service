package com.example.restfulservices.repositories;

import com.example.restfulservices.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

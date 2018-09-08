package com.uday.customer.customermodule.com.uday.customermodule.repository;


import com.uday.customer.customermodule.com.uday.customermodule.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

package com.uday.customer.customermodule;

import com.uday.customer.customermodule.com.uday.customermodule.entities.Customer;
import com.uday.customer.customermodule.com.uday.customermodule.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomermoduleApplicationTests {

	@Autowired
    CustomerRepository customerRepository;

	@Test
	public void printStatement(){
		System.out.println("Testing database connection");
	}

	@Test
	public void insertCustomer(){
		Customer customer=new Customer();
		customer.setName("John");
		customer.setEmail("john.wallace@xyz.com");
		customerRepository.save(customer);
	}

	@Test
	public void showStudent(){
        Customer customer=customerRepository.getOne(1L);
        System.out.println(customer.toString());
    }

	@Test
	public void updateCustomer(){
		Customer customer=customerRepository.getOne(1L);
		customer.setName("Dave");
		customerRepository.save(customer);
	}

	@Test
    public void deleteCustomer(){
	    Customer customer=customerRepository.getOne(3L);
	    customerRepository.delete(customer);
    }
}

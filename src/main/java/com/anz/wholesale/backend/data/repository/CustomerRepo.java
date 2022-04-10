package com.anz.wholesale.backend.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.backend.data.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

	public Customer findCustomerByCustomerId(@Param("customerId") long customerId);
	
}

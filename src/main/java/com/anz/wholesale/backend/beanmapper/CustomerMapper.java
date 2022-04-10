package com.anz.wholesale.backend.beanmapper;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anz.wholesale.backend.data.entity.Customer;

@Component
public class CustomerMapper {

	public com.anz.wholesale.backend.domain.Customer getAccountObj(Customer entity) {
		
		com.anz.wholesale.backend.domain.Customer acc = new com.anz.wholesale.backend.domain.Customer();
		if(Optional.ofNullable(entity).isPresent())
			BeanUtils.copyProperties(entity, acc);
		return acc;
	}
	
	public Customer getAccountentity(com.anz.wholesale.backend.domain.Customer obj) {
		
		Customer entity = new Customer();
		if(Optional.ofNullable(obj).isPresent())
			BeanUtils.copyProperties(obj, entity);
		return entity;
	}

}

package com.anz.wholesale.backend.beanmapper;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anz.wholesale.backend.data.entity.Account;

@Component
public class AccountMapper {

	public com.anz.wholesale.backend.domain.Account getAccountObj(Account entity) {
		
		com.anz.wholesale.backend.domain.Account acc = new com.anz.wholesale.backend.domain.Account();
		if(Optional.ofNullable(entity).isPresent())
			BeanUtils.copyProperties(entity, acc);
		return acc;
	}
	
	public Account getAccountentity(com.anz.wholesale.backend.domain.Account obj) {
		
		Account entity = new Account();
		if(Optional.ofNullable(obj).isPresent())
			BeanUtils.copyProperties(obj, entity);
		return entity;
	}

}

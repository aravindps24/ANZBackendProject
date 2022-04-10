package com.anz.wholesale.backend.beanmapper;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.anz.wholesale.backend.data.entity.Transaction;

@Component
public class TransactionMapper {

	public com.anz.wholesale.backend.domain.Transaction getTrxnObj(Transaction entity) {
		
		com.anz.wholesale.backend.domain.Transaction trxn = new com.anz.wholesale.backend.domain.Transaction();
		if(Optional.ofNullable(entity).isPresent())
			BeanUtils.copyProperties(entity, trxn);
		return trxn;
	}
	
	public Transaction getTrxnentity(com.anz.wholesale.backend.domain.Transaction obj) {
		
		Transaction entity = new Transaction();
		if(Optional.ofNullable(obj).isPresent())
			BeanUtils.copyProperties(obj, entity);
		return entity;
	}

}

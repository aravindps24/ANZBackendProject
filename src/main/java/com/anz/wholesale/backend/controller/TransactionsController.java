package com.anz.wholesale.backend.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.backend.domain.AccountTransactions;
import com.anz.wholesale.backend.domain.TransactionSearch;
import com.anz.wholesale.backend.serviceapi.TransactionService;

@RestController
@RequestMapping(path = "/api/trxn")
public class TransactionsController {
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(path = "/retrieveAccountTrxns", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public AccountTransactions retrieveAccountTransactions(@RequestBody TransactionSearch search) {
		
		AccountTransactions accounts = null;
		
		accounts = transactionService.retrieveAccountTransactions(search);
		
		Link link = linkTo(methodOn(TransactionsController.class)
			      .retrieveAccountTransactions(search)).withSelfRel();
		
		accounts.add(link);
		return accounts;
	}
}

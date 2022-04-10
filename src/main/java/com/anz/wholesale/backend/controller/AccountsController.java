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

import com.anz.wholesale.backend.domain.AccountSearch;
import com.anz.wholesale.backend.domain.CustomerAccounts;
import com.anz.wholesale.backend.serviceapi.AccountsService;

@RestController()
@RequestMapping(path = "/api/account")

public class AccountsController {
	
	@Autowired
	private AccountsService accountsService;
	
	@RequestMapping(path = "/retrieveCustomerAccounts", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public CustomerAccounts retrieveCustomerAccounts(@RequestBody AccountSearch search) {
		
		CustomerAccounts accounts = null;
		
		accounts = accountsService.retrieveCustomerAccounts(search);
		
		Link link = linkTo(methodOn(AccountsController.class)
			      .retrieveCustomerAccounts(search)).withSelfRel();
		
		accounts.add(link);
		return accounts;
	}
}

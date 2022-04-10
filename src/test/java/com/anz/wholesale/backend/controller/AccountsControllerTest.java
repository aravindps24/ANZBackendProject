package com.anz.wholesale.backend.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.anz.wholesale.backend.config.TestConfig;
import com.anz.wholesale.backend.domain.AccountSearch;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class AccountsControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext; 
	
	@BeforeEach
    public void init() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }
	
	@Test
	public void testRetrieveCustomerAccounts() throws JsonProcessingException, Exception {
		
		AccountSearch search = new AccountSearch();
		search.setCustomerId(1);
		search.setPageNumber(0);
		search.setResultsPerPage(10);
		search.setSortColumn("accountNumber");
		
		mockMvc.perform( MockMvcRequestBuilders
	      .post("/api/account/retrieveCustomerAccounts")
	      .content(new ObjectMapper().writeValueAsString(search))
	      .contentType(MediaType.APPLICATION_JSON)
	      .accept(MediaType.APPLICATION_JSON))
		  .andDo(MockMvcResultHandlers.print())
	      .andExpect(status().isFound())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.accountNumber").exists());
	}
	
}

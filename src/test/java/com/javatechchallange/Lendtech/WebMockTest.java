package com.javatechchallange.Lendtech;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.javatechchallange.Lendtech.controllers.TransactionsController;
import com.javatechchallange.Lendtech.repositories.TransactionsRepository;

@WebMvcTest(TransactionsController.class)
public class WebMockTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TransactionsRepository service;

	@Test
	public void transactionsControllerPaymentsTest() throws Exception {
		when(service.count()).thenReturn((long) 3);
		this.mockMvc.perform(get("/api/v1/transactions/payments/1")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void transactionsControllerLoansTest() throws Exception {
		when(service.count()).thenReturn((long) 3);
		this.mockMvc.perform(get("/api/v1/transactions/loans/1/01-20-2109/01-20-2111")).andDo(print()).andExpect(status().isOk());
	}
}

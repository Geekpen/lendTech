package com.javatechchallange.Lendtech;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javatechchallange.Lendtech.controllers.TransactionsController;

@SpringBootTest
class LendtechApplicationTests {
	
	@Autowired
	private TransactionsController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

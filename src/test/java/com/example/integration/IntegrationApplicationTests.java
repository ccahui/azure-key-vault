package com.example.integration;

import com.example.integration.config.ValuesProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest(properties = "spring.config.name=application-test")
class IntegrationApplicationTests {

	@MockBean
	private ValuesProperties keyVaultService;
	@Test
	void contextLoads() {
		when(keyVaultService.getLocalValue()).thenReturn("mocked-secret");
	}

}

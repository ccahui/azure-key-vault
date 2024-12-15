package com.example.integration;

import com.example.integration.config.ValuesProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;


import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(properties = "spring.config.name=application-test")
class IntegrationApplicationTests {


	@Autowired
	ValuesProperties valuesProperties;


	@Test
	void loadValuesPropertiesOk() {
		assertNotNull(valuesProperties.getLocalValue());
		assertNotNull(valuesProperties.getApiKeyVault());
		assertNotNull(valuesProperties.getApiKeyVault3());
		assertNotEquals("", valuesProperties.getApiKeyVault3());
		assertNotEquals("", valuesProperties.getApiKeyVault());
	}

}

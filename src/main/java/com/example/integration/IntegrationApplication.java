package com.example.integration;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.example.integration.config.ValuesProperties;
import com.microsoft.applicationinsights.attach.ApplicationInsights;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntegrationApplication {

	@Autowired
	ValuesProperties values;
	public static void main(String[] args) {
		ApplicationInsights.attach();
		SpringApplication.run(IntegrationApplication.class, args);
	}
}

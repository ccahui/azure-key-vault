package com.example.integration.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ValuesProperties {
    @Value("${local.timeout}")
    public String localValue;
    @Value("${api-key-2}")
    public String apiKeyVault2;
    @Value("${api-key-3}")
    public String apiKeyVault3;
    @Value("${api-key-4}")
    public String apiKeyVault4;
    @Value("${api-key-5}")
    public String apiKeyVault5;

}

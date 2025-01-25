package com.example.integration.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ValuesProperties {
    @Value("${local.timeout}")
    public String localValue;
    @Value("${api-key-4}")
    public String apiKeyVault;
    @Value("${api-key-5}")
    public String apiKeyVault3;


    public String toString() {
        // Personaliza el formato de tu toString aquí
        return "ValuesProperties{" +
                "localValue='" + localValue + '\'' +
                ", apiKeyVault='" + apiKeyVault + '\'' +
                ", apiKeyVault3='" + apiKeyVault3 + '\'' +
                '}';
    }

}

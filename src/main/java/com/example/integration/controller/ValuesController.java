package com.example.integration.controller;

import com.example.integration.config.ValuesProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class ValuesController {

    private final ValuesProperties valuesProperties;

    public ValuesController(ValuesProperties valuesProperties) {
        this.valuesProperties = valuesProperties;
    }

    @GetMapping("/all")
    public String getValues() {
        return valuesProperties.toString();
    }
}
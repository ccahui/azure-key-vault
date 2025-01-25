package com.example.integration.controller;

import com.example.integration.config.ValuesProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
@Slf4j
public class ValuesController {

    private final ValuesProperties valuesProperties;

    public ValuesController(ValuesProperties valuesProperties) {
        this.valuesProperties = valuesProperties;
    }

    @GetMapping("/all")
    public String getValues() {
        log.info("INFO {}", valuesProperties.getLocalValue());
        log.error("ERROR {}", valuesProperties.getLocalValue());
        log.debug("DEBUG {}", valuesProperties.getLocalValue());
        return valuesProperties.toString();
    }
}
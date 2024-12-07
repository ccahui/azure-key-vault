package com.example.integration.controller;

import com.example.integration.config.ValuesProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@SpringBootTest(properties = "spring.config.name=application-test")
@AutoConfigureMockMvc
public class ValuesControllerTest {

    @Autowired
    ValuesProperties values;
    @Autowired
    MockMvc mockMvc;
    @Test
    public void getConfigAll() throws Exception {
       String data =  mockMvc.perform(get("/api/config/all"))
                .andExpect(status().isOk())
                .andReturn().getResponse()
               .getContentAsString();// Verifica que el estado HTTP sea 200 OK
        assertNotNull(data);
        assertEquals(values.toString(), data);
    }
}
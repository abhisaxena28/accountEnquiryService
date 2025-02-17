package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AccountTransactionTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllAccounts() throws Exception {
        mockMvc.perform(get("/api/accounts"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(4)))
                .andExpect(jsonPath("$[0].accountNumber", is("585309209")))
                .andExpect(jsonPath("$[1].accountNumber", is("791066619")))
                .andExpect(jsonPath("$[2].accountNumber", is("321143048")))
                .andExpect(jsonPath("$[3].accountNumber", is("347786244")));
    }

    @Test
    public void testGetTransactionsByAccountNumber() throws Exception {
        mockMvc.perform(get("/api/transactions/{accountNumber}", "585309209"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].transactionType", is("Debit")))
                .andExpect(jsonPath("$[1].transactionType", is("Credit")));
    }
}
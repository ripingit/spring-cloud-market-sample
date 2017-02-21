package com.utsman.market.statistics.interfaces.web.controller;

import com.google.common.collect.Lists;
import com.utsman.market.statistics.domain.best.model.BestSeller;
import com.utsman.market.statistics.domain.best.service.BestSellerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(StatisticsController.class)
public class StatisticsControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private BestSellerService bestSellerService;

    @Test
    public void getBestSellers() throws Exception {
        given(bestSellerService.getList())
                .willReturn(Lists.newArrayList(BestSeller.builder()
                        .itemName("onepiece")
                        .price(25000)
                        .build()));

        mvc.perform(get("/statistics/bestseller")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"itemName\":\"onepiece\",\"price\":25000}]"));

    }

}
package com.utsman.market.statistics.controller;

import com.google.common.collect.Lists;
import com.utsman.market.statistics.domain.BestSeller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/statistics")
public class StatisticsController {
    @RequestMapping(value = "/bestseller")
    public List<BestSeller> getBestSellers() {
        BestSeller bestSeller = BestSeller.builder()
                .itemName("onepiece")
                .price(25000)
                .build();
        return Lists.newArrayList(bestSeller);
    }
}

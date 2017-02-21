package com.utsman.market.statistics.interfaces.web.controller;

import com.utsman.market.statistics.domain.best.model.BestSeller;
import com.utsman.market.statistics.domain.best.service.BestSellerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/statistics")
public class StatisticsController {
    @Autowired
    BestSellerService bestSellerService;

    @RequestMapping(value = "/bestseller")
    public List<BestSeller> getBestSellers() {
        return bestSellerService.getList();
    }
}

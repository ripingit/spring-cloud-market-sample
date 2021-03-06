package com.utsman.market.statistics.domain.best.service;

import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.utsman.market.statistics.domain.best.model.BestSeller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestSellerServiceImpl implements BestSellerService {
    @HystrixCommand
    @Override
    public List<BestSeller> getList() {
        return Lists.newArrayList(BestSeller.builder()
                .itemName("onepiece")
                .price(25000)
                .build());
    }
}

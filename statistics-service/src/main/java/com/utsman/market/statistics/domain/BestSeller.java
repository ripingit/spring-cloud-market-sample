package com.utsman.market.statistics.domain;

import lombok.Builder;
import lombok.Getter;

@Builder @Getter
public class BestSeller {
    private String itemName;
    private int price;
}

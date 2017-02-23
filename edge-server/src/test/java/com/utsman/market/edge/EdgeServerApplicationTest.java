package com.utsman.market.edge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = EdgeServerApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        value = {
                "eureka.client.enabled=false",
                "spring.cloud.config.fail-fast=false"
        }
)
public class EdgeServerApplicationTest {
    @Test
    public void contextLoads() {}


}
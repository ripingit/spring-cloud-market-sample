package com.utsman.market.service.discovery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class EurekaServerApplicationTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void catalogLoads() {
        ResponseEntity<Map> entity =
                testRestTemplate
                        .getForEntity("/eureka/apps", Map.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }
}
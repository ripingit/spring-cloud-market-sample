package com.utsman.market.service.discovery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes = EurekaServerApplicationTest.Application.class,
        webEnvironment = RANDOM_PORT,
        value = {
          "spring.application.name=eureka",
          "server.contextPath=/context",
          "management.security.enabled=false"
        })
public class EurekaServerApplicationTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @LocalServerPort
    int port;

    @Test
    public void catalogLoads() {
        ResponseEntity<Map> entity =
                testRestTemplate.getForEntity("http://localhost:" + port + "/context/eureka/apps", Map.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }

    @Configuration
    @EnableAutoConfiguration
    @EnableEurekaServer
    protected static class Application {
        public static void main(String[] args) {
            new SpringApplicationBuilder(Application.class).run(args);
        }

    }
}
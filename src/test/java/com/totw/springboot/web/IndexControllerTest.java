package com.totw.springboot.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void 메인페이지_로딩() {
        // When
        String body = this.restTemplate.getForObject("/", String.class);
        System.out.println("body = " + body);

        // Then
        assertThat(body).contains("스프링 부트 웹서비스");
    }
}

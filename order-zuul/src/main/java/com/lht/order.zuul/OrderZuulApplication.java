package com.lht.order.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class OrderZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderZuulApplication.class, args);
    }

}

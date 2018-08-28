package com.solstice.stocksymbol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class StockSymbolApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockSymbolApplication.class, args);
    }
}

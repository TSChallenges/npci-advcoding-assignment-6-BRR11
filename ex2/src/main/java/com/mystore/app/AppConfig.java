package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        return new Product(1, "Tumbler");
    }

    @Bean
    public Product bucket() {
        return new Product(2, "Bucket");
    }
}

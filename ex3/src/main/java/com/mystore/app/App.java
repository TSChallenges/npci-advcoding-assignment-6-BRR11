package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Product beans from Spring container
        Product p1 = context.getBean(Product.class);
        p1.setId(1);
        p1.setName("Tumbler");
        p1.setBarcode();
        System.out.println(p1);

        Product p2 = context.getBean(Product.class);
        p2.setId(2);
        p2.setName("Bucket");
        p2.setBarcode();
        System.out.println(p2);
    }
}

package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Product beans from Spring container
        Product p1 = context.getBean("tumbler", Product.class);
        Product p2 = context.getBean("bucket", Product.class);

        // Print product details
        System.out.println(p1);
        System.out.println(p2);
    }
}

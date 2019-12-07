package com.sabah.demodep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDepApplication {

    public static void main(String[] args) {
        new Lib();
//        SpringApplication.run(DemoDepApplication.class, args);
        System.out.println(123);
    }

}

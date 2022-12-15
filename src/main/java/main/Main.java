package main;

import config.HelloConfig;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.*;
import service.HelloService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);

        HelloService hello = (HelloService) context.getBean(HelloService.class);

        hello.hello("Tien");
    }
}

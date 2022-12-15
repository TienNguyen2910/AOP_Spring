package config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import service.HelloService;
@Configuration
@ComponentScan(basePackages = {"service","aspect"})
@EnableAspectJAutoProxy
public class HelloConfig {
//    @Bean
//    public HelloService helloService(){
//        return new HelloService();
//    }
}

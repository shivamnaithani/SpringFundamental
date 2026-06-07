package org.example;

import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Engine engine1(){
        return new Engine("v8" , 100);
    }
    @Bean
    public Engine engine2(){
        return new Engine("v9" , 200);
    }

    @Bean
    public Car mycar(){
        return new Car("Suv" , engine1());
    }
    @Bean
    public Car mycar2(){
        return new Car("Sedan" , engine2());
    }
}

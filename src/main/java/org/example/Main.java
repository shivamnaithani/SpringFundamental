package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
       /* System.out.println("working... 12349");
        Engine engine = new Engine("v8",100);
        Engine engine2 = new Engine("v10",500);
        Car car = new Car("SUV");*/


       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Car car = applicationContext.getBean("mycar",Car.class);
        Car car2 = applicationContext.getBean("mycar2",Car.class);
       car.drive();car2.drive();
        //Checking Project update on github
    }
}

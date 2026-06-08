package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired // What will @Autowired do here? Here, the Engine is automatically wired with Spring. This means Spring will automatically identify the Engine and inject its (Engine's) dependency into the system.
    private Engine engine;

    private String cartype;


    public Car(@Value("${car.cartype}") String cartype, Engine engine){
        this.engine = engine;
        this.cartype = cartype;
    }





    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public void drive(){
         engine.start();
         System.out.println(cartype + " is driving.");
    }
}

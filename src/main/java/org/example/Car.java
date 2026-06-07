package org.example;

public class Car {

    private Engine engine;
    private String cartype;


    public Car(String cartype,Engine engine){
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

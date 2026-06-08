package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String engineType;

    private int enginePower;

    public Engine(@Value("${engine.engineType}") String engineType , @Value("${engine.enginePower}") int enginePower){
        this.engineType = engineType;
        this.enginePower = enginePower;


    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void start(){
        System.out.println("Start the engine "+engineType + " with engine power " + enginePower);
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //  Here use inheritence in order to derive a subclass and call that subclass as a component

//@Scope("prototype") // You can change the scope of a bean by specifying the desired scope when declaring the component.

public class FunkyCar extends Car {
    public FunkyCar(@Value("${funkyCar.cartype}")String cartype , @Qualifier("PetrolEngine") Engine engine){
        super(cartype,engine);
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DieselEngine") // Here, we provide the name of the bean that Spring is going to create.
public class DieselEngine extends Engine{
    public DieselEngine(@Value("${dieselEngine.engineType}") String engineType , @Value("${dieselEngine.enginePower}") int enginePower){
        super(engineType,enginePower);
    }
}

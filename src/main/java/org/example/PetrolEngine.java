package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PetrolEngine") // Here, we provide the name of the bean that Spring is going to create.
public class PetrolEngine extends Engine {
    public PetrolEngine(@Value("${petrolEngine.engineType}") String engineType, @Value("${petrolEngine.enginePower}") int enginePower) {
        super(engineType, enginePower);
    }
}

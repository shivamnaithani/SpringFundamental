package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //  Here use inheritence in order to derive a subclass and call that subclass as a component
public class HybridCar extends Car {
  public HybridCar(@Value("${hybridCar.cartype}")String cartype ,@Qualifier("DieselEngine") Engine engine){ //  Here, we use a unique identifier to specify which engine should be injected. This is called a qualifier. Without it, Spring will throw an error because there is more than one bean of type Engine (i.e., PetrolEngine and DieselEngine).
    super(cartype,engine);
  }
}

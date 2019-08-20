package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.model.Car;

public class CarFactory {

    public static Car buildCar(String model) {
        System.out.println("\tbuilding a car..");
        return new Car(model);
    }
}

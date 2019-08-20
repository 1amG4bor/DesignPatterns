package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.model.Truck;

public class TruckFactory {

    public static Truck buildTruck(String model) {
        System.out.println("\tbuilding a truck..");
        return new Truck(model);
    }
}

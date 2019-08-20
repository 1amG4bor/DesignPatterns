package creationalPattern.abstractFactory;

import creationalPattern.abstractFactory.model.Car;
import creationalPattern.abstractFactory.model.Truck;
import creationalPattern.factory.PolygonFactory;
import creationalPattern.abstractFactory.VehicleFactory.VehicleType;

public class AbstractFactoryUsage {
    public static void main(String... args) {
        System.out.println("AbstractFactory TEST!\n");

        System.out.println("Create vehicles...");
        Car ferrari = (Car) VehicleFactory.buildVehicle(VehicleType.CAR, "Ferrari F50");
        Car alfa = (Car) VehicleFactory.buildVehicle(VehicleType.CAR, "Alfa Romeo Brera");
        Truck scania = (Truck) VehicleFactory.buildVehicle(VehicleType.TRUCK, "Scania S450");
        Truck kraz = (Truck) VehicleFactory.buildVehicle(VehicleType.TRUCK, "KrAZ–255");
        PolygonFactory factory = new PolygonFactory();
        System.out.println("Creation process is finished.\n");

        System.out.println("Created vehicle: " + ferrari.getDescription());
        System.out.println("Created vehicle: " + alfa.getDescription());
        System.out.println("Created vehicle: " + scania.getDescription());
        System.out.println("Created vehicle: " + kraz.getDescription());
    }
}

package creationalPattern.abstractFactory;

public class VehicleFactory {

    public static Vehicle buildVehicle(VehicleType type, String model) {
        switch (type) {
            case CAR:
                return CarFactory.buildCar(model);
            case TRUCK:
                return TruckFactory.buildTruck(model);
            default:
                return null;
        }
    }

    public enum VehicleType {
        CAR,
        TRUCK;
    }
}

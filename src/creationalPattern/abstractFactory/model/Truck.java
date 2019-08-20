package creationalPattern.abstractFactory.model;

import creationalPattern.abstractFactory.Vehicle;

public class Truck implements Vehicle {
    private String model;

    public Truck(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "This is a truck, model: " + model;
    }
}

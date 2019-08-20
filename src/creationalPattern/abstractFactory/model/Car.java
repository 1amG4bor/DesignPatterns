package creationalPattern.abstractFactory.model;

import creationalPattern.abstractFactory.Vehicle;

public class Car implements Vehicle {
    private String model;

    public Car(String model) {
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
        return "This is a car, model: " + model;
    }
}

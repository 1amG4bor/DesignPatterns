package creationalPattern.factory.model;

import creationalPattern.factory.Polygon;

public class Circle implements Polygon {
    @Override
    public String getType() {
        return "Circle";
    }
}

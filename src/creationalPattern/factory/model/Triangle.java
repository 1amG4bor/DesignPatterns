package creationalPattern.factory.model;

import creationalPattern.factory.Polygon;

public class Triangle implements Polygon {
    @Override
    public String getType() {
        return "Triangle";
    }
}

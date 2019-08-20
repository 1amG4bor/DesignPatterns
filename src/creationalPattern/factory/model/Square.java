package creationalPattern.factory.model;

import creationalPattern.factory.Polygon;

public class Square implements Polygon {
    @Override
    public String getType() {
        return "Square";
    }
}

package creationalPattern.factory;

import creationalPattern.factory.model.Circle;
import creationalPattern.factory.model.Square;
import creationalPattern.factory.model.Triangle;

public class PolygonFactory {

    public PolygonFactory() {
    }

    public Polygon getPolygon(int numberOfSides) {
        System.out.println("\tcreate " + numberOfSides + " side(s) polygon..");
        switch (numberOfSides) {
            case 1:
                return new Circle();
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            default:
                return null;
        }
    }
}

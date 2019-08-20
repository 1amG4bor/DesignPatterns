package creationalPattern.factory;

public class PolygonFactory {

    public PolygonFactory() {
    }

    public Polygon getPolygon(int numberOfSides) {
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

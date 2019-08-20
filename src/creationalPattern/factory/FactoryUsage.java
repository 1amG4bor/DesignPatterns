package creationalPattern.factory;

public class FactoryUsage {

    public static void main(String... args) {
        System.out.println("Factory TEST!");
        PolygonFactory factory = new PolygonFactory();
        Circle circle = (Circle) factory.getPolygon(1);
        Triangle triangle = (Triangle) factory.getPolygon(3);
        Square square = (Square) factory.getPolygon(4);
        System.out.println("Polygons has been created.");

        System.out.println("Type of 'circle' is: " + circle.getType());
        System.out.println("Type of 'triangle' is: " + triangle.getType());
        System.out.println("Type of 'square' is: " + square.getType());
        System.out.println();
    }
}

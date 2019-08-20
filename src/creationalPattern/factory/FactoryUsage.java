package creationalPattern.factory;

import creationalPattern.factory.model.Circle;
import creationalPattern.factory.model.Square;
import creationalPattern.factory.model.Triangle;

public class FactoryUsage {

    public static void main(String... args) {
        System.out.println("Factory TEST!\n");

        System.out.println("Create polygons...");
        PolygonFactory factory = new PolygonFactory();
        Circle circle = (Circle) factory.getPolygon(1);
        Triangle triangle = (Triangle) factory.getPolygon(3);
        Square square = (Square) factory.getPolygon(4);
        System.out.println("Creation process is finished.\n");

        System.out.println("Type of 'circle' is: " + circle.getType());
        System.out.println("Type of 'triangle' is: " + triangle.getType());
        System.out.println("Type of 'square' is: " + square.getType());
    }
}

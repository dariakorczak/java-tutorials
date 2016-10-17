package pl.dkorczak.java_tutorials.shapes;

import com.google.common.collect.Lists;
import pl.dkorczak.java_tutorials.shapes.shape.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        badExample();
        goodExample();
    }

    private static void badExample() {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2, 4);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2, 5, 3, 2);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(triangle);

        printBad(shapes);
        printGood(shapes);
        printTheBest(shapes);
    }

    private static void goodExample() {
        List<Shape> shapes = Lists.newArrayList(
                new Circle(4),
                new Rectangle(2, 4),
                new Square(2),
                new Triangle(2, 5, 3, 2)
        );

        printBad(shapes);
        printGood(shapes);
        printTheBest(shapes);
    }

    private static void printBad(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    private static void printGood(List<Shape> shapes) {
        shapes.forEach(shape -> System.out.println(shape));
    }

    private static void printTheBest(List<Shape> shapes) {
        shapes.forEach(System.out::println);
    }

}

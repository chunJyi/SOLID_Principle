package org.solid.OpenCloseResponsibility;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Square square = new Square(15);
        Circle circle = new Circle(15);
        List<Shape> shapes = List.of(circle,square);
        calculator.area(shapes);


    }
}

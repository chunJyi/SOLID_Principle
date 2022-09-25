package org.solid.SingleResponsibility;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Square square = new Square(15);
        Circle circle = new Circle(15);
        List<Object> shapes = List.of(circle,square);
        Map<String, Integer> area = calculator.sum(shapes);
        Converter converter = new Converter();
/*
        broke the SingleResponsibility
*/
//      System.out.println(calculator.ConvertToCSV(area));
/*
        solve the SingleResponsibility
*/
        System.out.println(converter.ConvertToCSV(area));

    }
}

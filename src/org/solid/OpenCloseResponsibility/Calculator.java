package org.solid.OpenCloseResponsibility;

import java.util.List;

public class Calculator {

  public void area(List<Shape> shapes){
      for (int i = 0; i < shapes.size(); i++) {
          Shape shape = shapes.get(i);
          System.out.println(shape.area());
      }
  }
}

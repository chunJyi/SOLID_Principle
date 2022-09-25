package org.solid.SingleResponsibility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

  public Map<String,Integer> sum(List<Object> shapes){
      Map<String,Integer> area = new HashMap<>();

      for (int i = 0; i < shapes.size(); i++) {
          Object shape = shapes.get(i);
          if (shape instanceof Square) {
              int square = (int) Math.pow(((Square) shape).getLength(), 2);
              area.put("square", square);
          }
          if (shape instanceof Circle) {
              int circle = (int) (Math.PI * Math.pow(((Circle) shape).getRadius(), 2));
              area.put("circle", circle);
          }
      }
      return area;
  }

/*
  this method is broke Single Responsibility
*/
  public String ConvertToCSV(Map<String,Integer> area){
      String json =null;
      for (Map.Entry<String,Integer> entry:area.entrySet()) {
            json =json +  entry.getKey() + ","  + entry.getValue() + "\n";
      }
      return json;
  }
}

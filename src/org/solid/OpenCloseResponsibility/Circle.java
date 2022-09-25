package org.solid.OpenCloseResponsibility;

public class Circle implements Shape{

    private final int radius;


    public Circle(int length) {
        this.radius = length;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public String area() {
        int circle = (int) (Math.PI * Math.pow(getRadius(), 2));
        return String.format("circle = %s",circle);
    }
}

package org.solid.OpenCloseResponsibility;

import java.util.Map;

public class Square implements Shape{

    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    public String area() {
        int square = (int) Math.pow(getLength(), 2);
        return String.format("square = %s",square);

    }
}

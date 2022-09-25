package org.solid.InterfaceSegregationPrinciple;

public class Crow implements Bird,Flyable {

    @Override
    public void fly() {
        System.out.println("Crow is fly");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eat");
    }
}

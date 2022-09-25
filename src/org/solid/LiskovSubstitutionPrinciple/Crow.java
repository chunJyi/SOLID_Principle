package org.solid.LiskovSubstitutionPrinciple;

public class Crow extends Bird{
    @Override
    public void fly() {
        System.out.println("Crow is fly");
    }

    @Override
    public void eat() {
        super.eat();
    }
}

package org.solid.InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args){
        Crow crow = new Crow();
        crow.fly();
        crow.eat();
        Penguin penguin = new Penguin();
        penguin.eat();
    }

}

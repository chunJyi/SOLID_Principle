package org.solid.DependencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {
        Mouse USB_mouse = new USBMouse();
        Computer computer = new Computer();
        computer.setMouse(USB_mouse);
        computer.mouseClick();
    }
}

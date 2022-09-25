package org.solid.DependencyInversionPrinciple;

public class USBMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("click mouse using by UsbMouse.");
    }
}

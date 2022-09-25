package org.solid.DependencyInversionPrinciple;

public class WirelessMouse implements Mouse{

    @Override
    public void click() {
        System.out.println("click mouse using by WirelessMouse.");

    }
}

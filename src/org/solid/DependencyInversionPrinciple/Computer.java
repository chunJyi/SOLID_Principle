package org.solid.DependencyInversionPrinciple;

public class Computer {

    Mouse mouse;   //composition interface

/*
    //borke the DependencyInversionPrinciple

    USBMouse usbMouse;

    public void setMouse(USBMouse usbMouse) {
        this.usbMouse = usbMouse;
    }
*/
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void mouseClick(){
        mouse.click();
   //     usbMouse.click();
    }
}

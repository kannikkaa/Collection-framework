package javaOOPs;

//default methods are allowed only in interfaces not in class
//they are not mandatory to override unless there's a conflict
//they are always public
//can be called with InterfaceName.super.methodName(); if there are different interfaces it is implementing
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("hello");
    }
    default void record4KVideo(){//if i am creating this method after my programme was made, if it had been abstract then iwouldve to define
        //  it in the class i am implementing this interface in that would cause problem & i can now override it or not(my choice)
        System.out.println("recording in 4k in camera");
    }
}

interface  WiFi{
    void connectToNetwork();
    //@Override (The @Override annotation can only be used when a method overrides a method from a superclass or implementing interface.&
    // Interfaces cannot override methods from other interfaces unless one extends the other.)
    default void record4KVideo(){
        System.out.println("wifi is recording 4k video");
    }
}

class SmartPhone implements Camera, WiFi{
    @Override
    public void record4KVideo(){//here i am overriding a method, i must use InterfaceName.super.methodName(); in class to differ
        //which interface's method i am calling (If a class implements multiple interfaces that contain a method with the same signature
        // (abstract or default), the class must override that method to resolve the conflict).
        WiFi.super.record4KVideo();
        System.out.println("smartphone is recording 4k video ");
    }
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void recordVideo() {
        System.out.println("recording video");
    }
    public void connectToNetwork() {
        System.out.println("connecting to network");
    }
}
public class DefaultMethod {
    public static void main(String[] args) {
SmartPhone samsung = new SmartPhone();
samsung.connectToNetwork();
samsung.recordVideo();
samsung.record4KVideo();
//samsung.greet(); this would throw an error, bec greet is a private method(cant access them)
    }
}

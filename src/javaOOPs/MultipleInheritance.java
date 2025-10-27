package javaOOPs;

//why java use multiple inheritance in interface but not in class, eg, smartphone = subclass, cellphone = superclass, gps=interface,
//camera=interface, mediaplayer=interface, so smartphone is a updated tyep of cellphone(its a phone), but smartphone is not a gps or mediaplayer or
//camera, u can just use your smartphone like them(follow their rules) but it can never be those things, but it'll always be a cellphone:polymorphism
interface A {
    default void greet() {
        System.out.println("Hello from javaOOPs.A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from javaOOPs.B");
    }
}
// a class can extends only 1 class and can implements multiple interfaces simultanously
class C implements A, B {
    @Override//better to use this annotation
    public void greet() {
        A.super.greet(); // 👈 You can choose javaOOPs.A's greet() or javaOOPs.B's greet() & this cant be used with classes, if u think multiple inheritance can
        //work in classes also by using javaOOPs.A.super.methodName();
        // javaOOPs.B.super.greet(); // Or this instead
        System.out.println("Resolved in javaOOPs.C");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C cObj = new C();
        cObj.greet();
    }
}

package javaOOPs;

class Phone {
    int price;
    Phone(int price) {//if i have not passed any parameters in it, i wont have to call it in subclass(its constructors also has no parameters in it)
        // using super keyword, it would automatically print its body in console, bec subclass extends it
        System.out.println("price of normal phone is "+price);
    }
}
//rule:If the superclass has a parameterized constructor, the subclass must explicitly call it
// using super(...), regardless of whether the subclass constructor has parameters or not.

class Samsung extends Phone{
    String model;//instance variable
    Samsung(int price, String model) {
        super(price);//in subclass u have to manually call  the super class constructor
        this.model= model;
       // super(price);//calling manually super class constructor
        System.out.println("javaOOPs.Samsung phone price is and its model is "+price+" its model is "+model);
    }
}

public class Constructors2 {
    public static void main(String[] args) {
Samsung s21 = new Samsung(25000, "s21");
//here it'll automatically call the parent class and child class constructor, if making object of subclass
    }
}
//constructor chaining:here in the main method , when u create object of subclass, so it prints both super and subclass's constructors, even if
//u havent called it in subclass(if it has no parameters), but THE CONSTRUCTOR OF SUPERCLASS IS NOT THERE IN SUBCLASS(NOT INHERITED)
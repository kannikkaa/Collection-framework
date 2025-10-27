package javaOOPs;

abstract class Base{  //one abstract method makes whole class abstract
    String name;//can have fields, fields can be inherited by subclass, if public, default and protected(not private, can be used by getters/setters)
    int age;
    abstract public  void greet();//abstract method(hides how greet is working)
    Base(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("how are you");
    }//Abstract class extends another abstract class
}
//if derived class extends abstract class, then it must override its abstract method or make itself abstrac
class Derived extends Base{
    int houseNo ;
    @Override
    //The first non-abstract class that inherits must implement all abstract methods.
    public void greet(){
        System.out.println("good morning");
    }
    Derived(String name, int age, int houseNo){
super(name, age);
this.houseNo = houseNo;
        System.out.println("name: "+name+" age: "+age+" houseNo: "+houseNo);
    }
    public void bye(){
        System.out.println("bye");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
       // javaOOPs.Base obj1 = new javaOOPs.Base("kanika", 24);//cant create object of an abstract class(cant be instantiated)
        Derived obj = new Derived("kanika", 24, 201);
     obj.greet();//if calling abstract methd,it'll only print wht it's asking to print, never show the internal calculation,condition,exists everywhere
     obj.bye();
    }
}

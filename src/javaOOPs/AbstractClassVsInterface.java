package javaOOPs;

interface Animalia {
    static String name = "sophie";
static void getBreed(){
    System.out.println(name+" is a rottweiler");
}
}
    public class AbstractClassVsInterface {
        public static void main(String[] args) {
            //javaOOPs.Animalia dog = new javaOOPs.Animalia();(if javaOOPs.Animalia was a class)
            System.out.println(Animalia.name);//can access static variables via objects also, but not preferred
Animalia.getBreed();//u can access static methods via objects also, but not preferred

    }
}
//abstract classes can have constructors
//cant create objects of abstract class and interface
//in abstract class, access modifiers(public, private, default, protected), interface(public)
//interface cant access a class but can access other interfaces, but a class can implement multiple interfaces,
//abstract class can extends multiple interfaces
//must override all the abstract methods present in an interface/abstract class

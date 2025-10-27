package javaOOPs;

abstract class Telephone {
    long num;
abstract String ring(long num1);
abstract void lift();
abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public String ring(long num){
        return "ringing...."+num;
    }
    public String ring(){//compile time polymorphism
        return "ringing ";
    }
    public void lift(){
        System.out.println("lifting smart telephone");
    }
    public void disconnect(){
        System.out.println("disconnecting thru smart telephone");
    }

}
    public class AbstractInterfacePractice3 {
    public static void main(String[] args) {
Telephone mi = new SmartTelephone();
        System.out.println(mi.ring(8302299010L));
mi.lift();
mi.disconnect();
    }
}

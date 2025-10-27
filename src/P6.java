class Vehicle {
protected void startEngine(){
    System.out.println("Vehicle is starting...");
}
protected void speed(){
    System.out.println("car is speeding...");
}

}
class Cara extends Vehicle{
  protected   void startEngine(){
        System.out.println("Cara is starting...");
        super.startEngine();
    }
   protected void run(){
        System.out.println("car is running");
    }

}
    public class P6 {
        public static void main(String[] args) {
Vehicle myCar = new Cara();
myCar.startEngine(); //runtime polymorphism
myCar.speed();
Cara myCar2 = new Cara();
myCar2.startEngine();
myCar2.speed();
myCar2.run();
        }

}

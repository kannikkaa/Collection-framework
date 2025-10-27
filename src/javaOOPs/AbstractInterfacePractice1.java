package javaOOPs;

abstract class Pen {
abstract void write();
abstract void refill();
}
class FountainPen{
    public void write(){
        System.out.println("writing with fountain pen ");
    }
    public void refill(){
        System.out.println("refilling fountain pen");
    }
    void changeNib(){
        System.out.println("changing nib of fountain pen");
    }
    static void draw(){
        System.out.println("drawing with fountain pen");
    }


}
    public class AbstractInterfacePractice1 {
    public static void main(String[] args) {
        FountainPen.draw();
      FountainPen cello = new FountainPen();
      cello.refill();
      cello.write();
      cello.changeNib();
    }
}

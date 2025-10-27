package javaOOPs;

abstract class Shape {
abstract double getArea();
abstract double getPerimeter();
abstract void getDetail();
}


class Circle1 extends Shape{
    int radius;
    Circle1(int radius){
        this.radius= radius;
    }
    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    void getDetail(){
        System.out.println("Circle: area= "+getArea()+" , perimeter= "+getPerimeter());
    }
}
class Rectangle1 extends Shape{
    int length;
    int breadth;
    Rectangle1(int length, int breadth){
        this.length = length;
        this.breadth= breadth;
    }
    @Override
    double getPerimeter() {
        return 2*(length+breadth);
    }

    @Override
    double getArea() {
        return length*breadth;
    }
    @Override
     void getDetail(){
        System.out.println("Rectangle: area= "+getArea()+" , perimeter= "+getPerimeter());
    }
}
class Rhombus1 extends Shape{
    int diagonal1;
    int diagonal2;
    int side;
    Rhombus1(int diagonal1, int diagonal2, int side){
        this.diagonal1= diagonal1;
        this.diagonal2= diagonal2;
        this.side = side;
    }
    @Override
    double getPerimeter() {
        return 0.5*diagonal1*diagonal2;
    }

    @Override
    double getArea() {
        return 4*side;
    }
    @Override
    void getDetail(){
        System.out.println("Rhombus: area= "+getArea()+" , perimeter= "+getPerimeter());
    }
}
    public class Abstract2 {
        public static void main(String[] args) {
Circle1 myCircle = new Circle1(10);
Rectangle1 myRec = new Rectangle1(15, 50);
Rhombus1 myRhom = new Rhombus1(25, 35, 30);
           myCircle.getDetail();
           myRec.getDetail();
           myRhom.getDetail();
    }
}

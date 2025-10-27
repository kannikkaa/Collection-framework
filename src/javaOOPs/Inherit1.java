package javaOOPs;

class Circle {
    int radius;
Circle(int  radius){
    this.radius = radius;
}
float getArea(){
    return 3.14f*radius*radius;
}
float getPerimeter(){
    return 2*3.14f*radius;
}

}
class Cylinder extends Circle{
    int height;
    Cylinder(int radius, int height){
        super(radius);
        this.height = height;
    }
    float getTsa(){
        return (2*3.14f*radius*height)+(2*3.14f*radius*radius);
    }
    float getCsa(){
        return 2*3.14f*radius*height;
    }
    float getVolume(){
        return 3.14f*radius*radius*height;
    }
    String getDetailing(){
        return "TSA of cylinder: "+getTsa()+" CSA of cylinder: "+getCsa()+" Volume of cyinder: "+getVolume();
    }
}
    public class Inherit1 {
        public static void main(String[] args) {
        Cylinder cylind = new Cylinder(14, 35);
            System.out.println(cylind.getDetailing());
    }
}

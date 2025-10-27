package javaOOPs;

public class MethodOverloading2 {
    public static int calculateArea(int a){
        return a*a;
    }
    public static int calculateArea(int l, int b){
        return l*b;
    }
    public static double calculateArea(double r){
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        System.out.println("Area of square with sides 5: "+calculateArea(5) );
        System.out.println("Area of rectangle with l being 3, and b being 5: "+calculateArea(3, 5));
        System.out.println("Area of circle with radius is 10: "+calculateArea(10.0));
    }
}

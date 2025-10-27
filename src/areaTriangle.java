public class areaTriangle {
    public double getArea(int base, int height){
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        areaTriangle tri =new areaTriangle();
        double area = tri.getArea(34, 75);
        System.out.println("area of triangle: "+(int)area);
    }

}

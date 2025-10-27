package javaOOPs;

/* class CellPhone {
     public void getRing() {
         System.out.println("Ringing.....");
     }

     public void getVibrate() {
         System.out.println("Vibrating....");
     }

     public void getClick() {
         System.out.println("Clicking....");
     }
 }*/
 class Square{
     int side;
    public int getArea(int side){
        return side*side;
    }
    public int getPerimeter(int side){
        return 4*side;
    }
 }
    public class Oops2 {
        public static void main(String[] args) {
         /*CellPhone myCellPhone = new CellPhone();
         myCellPhone.getRing();
         myCellPhone.getVibrate();
         myCellPhone.getClick();*/
            Square chaukaurDabba = new Square();
chaukaurDabba.side = 5;
            System.out.println(chaukaurDabba.getArea(5));
            System.out.println(chaukaurDabba.getPerimeter(5));
        }
    }


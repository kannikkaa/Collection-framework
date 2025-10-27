import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class GettngInput {
    //creating a add method
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static void main (String[]args){
        //here we are asking from user to gve us two numbers using Scanner class , sc reads th int and stor it in num1 and num2
        Scanner sc = new Scanner(System.in);
        System.out.println("number 1");
        float num1 = sc.nextFloat();
        System.out.println("number 2");
        float num2 = sc.nextFloat();
        //i have typecasted the float result into int and stored it in c
        int c = (int) (num1 + num2);
        System.out.println(c);
        //calling the method and storing it in c
        short sum = (short) add(76, 87);
        System.out.println("addition of both numbers :" + sum);
        //to check if the input is int or no
        System.out.println("print something");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        System.out.println("print something");
        //next() method to check the next word written in console
        String f = sc.next();
        System.out.println(f);
    }
}


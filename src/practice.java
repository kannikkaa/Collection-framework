import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class practice {

    public static void main(String [] args){
        System.out.println("Print each subject marks, hindi , english , maths respectively");
        Scanner sc = new Scanner(System.in);
        int hindi = sc.nextInt();
        int english = sc.nextInt();
        int maths = sc.nextInt();
        int total = (hindi+english+maths);
        float perc = total/300.0f*100;
        System.out.println("your percentage is: "+perc +"%");
if (perc>=40 && hindi>=33 && english>=33 && maths>=33){
    System.out.println("Passed");
}
else{
    System.out.println("Failed");
}


    }
}

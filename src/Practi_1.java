import java.sql.SQLOutput;

public class Practi_1 {
    public static void main(String[] args) {
        long maxValue = 1123421234; //variable created of long type and assigned 2^64-1
        int b = (int) maxValue;

        System.out.println("Long max value : " + maxValue);
        System.out.println("Int typecasted value : " + b);


        if (b == maxValue) {
            System.out.println("You have succesfully converted a float max value ot int " + b);
        } else {
            System.out.println("sorry, not possible");
        }
    }
}

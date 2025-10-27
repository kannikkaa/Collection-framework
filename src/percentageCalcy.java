import java.util.Scanner;

public class percentageCalcy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" marks of eng, hindi, math, sst and science rspectively: ");
        float eng = sc.nextFloat();
        System.out.println(eng);
        float hin = sc.nextFloat();
        System.out.println(hin);
        float math = sc.nextFloat();
        System.out.println(math);
        float sst = sc.nextFloat();
        System.out.println(sst);
        float sci = sc.nextFloat();
        System.out.println(sci);
        float sum = eng + hin + math + sst + sci;
        System.out.println("sum of marks: " + sum);
        float perc = sum / 500 * 100;
        System.out.println("percentage: " + perc);
        //fnd cgpa & typecast the float sum into Int cgpa
        int cgpa = (int) (sum / 50);
        System.out.println("cgpa: " + cgpa);
        //CHECK WHETHER THE NUM IS INT OR NOT
        System.out.println("enter a number");
        boolean num = sc.hasNextInt();
        System.out.println(num);
        //check by using if-else clause
        System.out.println("enter something");
        if (sc.hasNextInt()) {
            int num5 = sc.nextInt();
            System.out.println(num5);
        } else {
            System.out.println("not integer");
        }


    }
}

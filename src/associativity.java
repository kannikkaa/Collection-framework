import java.util.Scanner;

public class associativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 6;
        int y = 4;
        int res = (x-y)/2;
        System.out.println(res);
        //increments
        int y1 = 7;
                int x1 = (++y1)*8;
        System.out.println(x1);
        char ch = 'B';
        System.out.println(++ch);
        float f = 7/4.0f *9/2.0f;
        System.out.println(f);
       char grade = 'B';
       grade = (char)(grade +8);
        System.out.println(grade);

    }
}

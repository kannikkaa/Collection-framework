import java.util.Scanner;

public class InputBufferHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        int age = sc.nextInt();
        sc.nextLine();//this clears the leftover newline, when u press enter, it goes to new line, it reads that (reads new line, tab, space)

String school = sc.nextLine();
        double per = sc.nextDouble();
    }
}

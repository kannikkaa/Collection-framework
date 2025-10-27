package loops;

public class Loops {
    public static void main(String[] args) {
       /* int i = 4;
        do {
            if (i <= 5) {
                System.out.println("i is smaller than or equal to 5, so printing");
                System.out.println(i);
                break;
            } else {
                System.out.println("i is more than 5, so not printing");
            }
            i++;
        }
        while (i <= 5);
        int i1 = 1;
        while (true) {
            if (i1 > 5) break;
            System.out.println(i1);
            i1++;
        }
        for (int a = 100; a <= 200; a++) {
            System.out.println(a);
        }
        for (int b = 200; b >= 100; b--) {
            System.out.println(b);
        }
        for (int c = 0; c <= 100; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }*/
      /*  Scanner sc = new Scanner(System.in);
        double number;// declaring the variable
//Java uses block scope – meaning, a variable only exists within the { } block in which it was declared.(so if i declared the variable inside the do loop thn it would cease to exist after that loop
        do {
            System.out.print("Enter a number between 1 and 100: ");
            number = sc.nextDouble();//Input stored in the already-declared variable
            if (number >= 1 && number <= 100) {
                System.out.println("valid");
                break;
            } else {
                System.out.println("try again");
            }
        } while (number > 1);*/
        //dowhile loop, initialize, then executes the body, updates in the body itself, then checks the condition for the next item(if true, run again), (if false, exit the loop)
        int x = 0;
        do {
            x--;
            System.out.println("x: " + x);
        } while (x >= 0);
        int d = 10;
        do {
            System.out.println(d);
            d++;
        }
        while (d < 5);

        for (int e = 11; e < 10; e++) { //1st initialize,  then checks the condition, if false(exit the loop), if true(executes the body), then update
            System.out.println(e);
        }

    }
}


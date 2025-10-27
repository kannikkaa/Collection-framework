class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public class Method2 {
        public static void main(String[] args) {
            Calculator calc = new Calculator(); // create one object

          //  int sum1 = calc.add(5, 10);   // use 1st time
            int sum2 = calc.add(10, 200); // use 2nd time
            int sum3 = calc.add(3, 4);    // use 3rd time

            System.out.println(calc.add(5, 10)); // 15
            System.out.println(sum2); // 300
            System.out.println(sum3); // 7
        }
    }





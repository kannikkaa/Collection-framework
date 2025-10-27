import org.w3c.dom.ls.LSOutput;

interface MathOperation {
    int multiply(int a, int b);
    int divide(int a, int b);
    boolean isEven(int num);

}
    public class AnonymousClass2 {
        public static void main(String[] args) {
            MathOperation m1 = new MathOperation() {//in this case we could have used lambda expression bec there r more than 1 abstract methods
                @Override
                public int multiply(int a, int b) {
                    return a*b;
                }

                @Override
                public int divide(int a, int b) {
                    return a/b;
                }

                @Override
                public boolean isEven(int num) {
                    return true;
                }
            };
            int res = m1.multiply(2, 7);
           int res1 =  m1.divide(20, 2);
           boolean res2 =  m1.isEven(5);
            System.out.println("result of add: "+res+" result of multiply: "+res1+" checking if given number is even or not: "+res2);

    }
}

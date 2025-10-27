public class pract {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }
        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
            System.out.println("kanika chhipa");
            if (a == 2) {
                System.out.println("the end!");
                return;//return and break works same(exits the loop)

            }
        }
    }
}

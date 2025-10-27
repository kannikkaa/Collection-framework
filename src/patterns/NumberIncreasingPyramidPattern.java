package patterns;

public class NumberIncreasingPyramidPattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){ //printing 5 rows
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

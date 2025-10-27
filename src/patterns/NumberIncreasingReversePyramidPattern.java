package patterns;

public class NumberIncreasingReversePyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 6;
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1; i<=n1; i++){
            for(int j=1; j<=i; j++){
                if(i+j%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

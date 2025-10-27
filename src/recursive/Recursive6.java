package recursive;

public class Recursive6 {
    public static void printNumbers(int n){
        if(n==0){
           return ;
        }
        printNumbers(n);
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
       printNumbers(n);
    }
}

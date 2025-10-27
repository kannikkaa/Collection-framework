package recursive;

public class Recursive3 {
    public static int getSum(int n){
        //recursive.recursion always has a base case otherwise it'll keep calling itself forever(StackOverflowError)
if(n==1){
    return 1;
}
return n+ getSum(n-1);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(getSum(a));
    }
}

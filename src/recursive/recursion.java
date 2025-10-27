package recursive;

public class recursion {

    public static int factorial(int num){
        if(num ==0 || num==1){
            return 1; //base case
        }
        else{
            //here this method is calling itself to perform the method on the next numbers it faces, until it faces base case
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(factorial(num));
    }

    }


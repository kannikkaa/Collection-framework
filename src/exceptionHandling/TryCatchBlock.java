package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchBlock {
    public static void main(String[] args)throws FileNotFoundException{//here i handled the compile time exception, now if file doesnt
        //exist then it will show runtime exception
        int a = 77;
         int b = 0;
         try {
             int c = a / b;//trying this code
             System.out.println(c);//printing this, if correct
         }
         catch(Exception e){
             System.out.println("cant put b to 0: "+ e);//printing this if not corret and catches exception
        }

    FileReader fr = new FileReader("sc/data.text");

        System.out.println("hello");
    }
}

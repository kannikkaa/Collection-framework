package javaOOPs;

public class MethodOverloading1 {
    public static void display(String name, boolean isAdmin){
       if(isAdmin){
           System.out.println(" hello, "+name);
       }
       else{
           System.out.println("who are you?");
       }
    }
    public static void display(boolean isActive, int count){
   if(isActive){
       System.out.println(" what are u doing?");
   }
   else{
       System.out.println("disclose your purpose");
   }
    }

    public static void main(String[] args) {
        display("kanika", false);
        display(false, 3);
    }
}

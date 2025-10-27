public class Method3 {
    //when u using some data type, then return statement is important, if using void then just use print statement or nothing
  public static void greet(){
      System.out.println("hello");
    }
    //here u r calling the method but not printing it
    public static void main(String[] args) {
        greet();
        //here u r calling the method and printing it using print method
       //System.out.println(greet());
    }
}
//Return Type	Can You Use in System.out.println()?	Why?
//void	❌ No	It doesn't return anything
//String, int, etc.	✅ Yes	Because it returns a value you can print
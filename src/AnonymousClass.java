@FunctionalInterface
    interface Sum{//functional interface has only 1 abstract method, but static & default methods can be more
    void add(int a, int b);
}
//public void add(int a, int b){
   // int res = a+b;
   // System.out.println("result of a + b "+res);
//}
//}
public class AnonymousClass {
    public static void main(String[] args) {
       Sum s = new Sum() {//here we cant create new object by using interface as an object reference, but its an anonymous inner class
           //(anonymous class: a class without a name that implements the interface)
           public void add(int a, int b){
               System.out.println("sum is: "+a+b);
           }
       };
       s.add(10, 20);
    }
}

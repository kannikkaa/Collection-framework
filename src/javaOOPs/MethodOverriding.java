package javaOOPs;

interface Animala {
    default void sound() {
        System.out.println("Animals make sound");
    }
}
class Doga implements Animala{
    //i cant override this method bec i have passed a parameter in this class but there was no paramter in interface method
    public void sound(int a){
        System.out.println("dog barks");
    }

}
public class MethodOverriding {
        public static void main(String[] args) {
            Animala sophie = new Doga();
            sophie.sound();//output: Animals make sound
            //IF U WERE OVERRRIDING the method sound(), and u made object of doga with reference of animala, then it would use the concept of
            //RUNTIME POLYMORPHISM, in which if u called obj.sound(); then it would print the doga sound();: output: dog barks
        }
}

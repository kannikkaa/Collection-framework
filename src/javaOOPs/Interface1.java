package javaOOPs;

interface Animal {
    //interfaces cant have constructors/they support default(inherited, optional to override), abstract, static methods(not inherited, cant override,
// can access via interface/class, not by object)/cant create object of an interface/variables must be public,static and final(must be initialized)/
    //cant declare abstract static method/
    void sound();//abstract method(no body)
int a = 10; //u can create properties in interface,but cant modify them as they r final, public and static
    static void move() {
        System.out.println("animals can fly, run");
    }

    default void getResidence() {
        System.out.println("animal can be a pet or be a wild");
    }
}
//when a class implement a interface, it automatically implements all its abstract methods and default methods(unless there is any conflict bw 2
// interfaces)
    class Doggo implements Animal {
       public void sound() {//if u r implementing an abstract method from an interface/abstract class, then must use with "public" access modifier
            System.out.println("dog barks");
        }

        public void getResidence() {//when u override a default method, must use it with public access modifier
            System.out.println("dog is a pet");

        }
        static void friendlyOrNot(){
            System.out.println("dog are very friendly");
        }
    }
        class Lion extends Doggo implements Animal{
          public void sound(){
                System.out.println("lion roars");
            }
@Override
           public void getResidence(){
                System.out.println("lion is a wild");
                super.getResidence();
            }
            static void friendlyOrNot(){
                System.out.println("lion cannot be friendly");
            }
        }
        public class Interface1 {
            public static void main(String[] args) {
                Animal.move();
                Doggo.friendlyOrNot();
                Lion sher = new Lion();
                sher.sound();
                sher.getResidence();//if u r overriding method from other class/interface, and making object of that class(in which u r overriding),
                //then it'd print yor class version only, unless u used super keyword in your class

            }
        }



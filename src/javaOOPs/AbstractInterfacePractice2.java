package javaOOPs;

interface BasicAnimal {
void eat();
void sleep();
}
    class Monkey{
    void jump(){
        System.out.println("monkey is jumping");
    }
    static void bite(){
    System.out.println("monkey is biting");
}
public void eat(){
    System.out.println("monkey is eating");
}
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("human is eating");
    }
    public void sleep(){
        System.out.println("human is sleeping");
    }
    static void bite(){//i cant override bite method bec its static
        System.out.println("human is biting");
    }
}
    public class AbstractInterfacePractice2 {
        public static void main(String[] args) {
Human.bite();
Monkey.bite();
Monkey kanika = new Human();
kanika.eat();//runtime polymorphism
//kanika.sleep();
kanika.jump();

    }
}

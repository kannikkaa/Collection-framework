package javaOOPs;

// interfaces can inherit from one or more other interfaces using the extends keyword
 interface A1 {
    void method1();                 // abstract
    default void method2() {       // default
        System.out.println("A: method2");
    }
    static void method3() {        // static
        System.out.println("A: method3");
    }
    int X = 10;  // constant (public static final)
    void method5();
}

interface B1 extends A1 {//here javaOOPs.B1(interface) dont have to override abstract method5() of interface javaOOPs.A1, but its inheriting it
    void method4();
    @Override// additional abstract(can be overriden, bec here it is inheriting javaOOPs.A1)
    default void method2() {       // override default method
        System.out.println("B: method2");
        //this javaOOPs.B1 has method1(), method2(), but not method3()
    }
    //public void method3(){ ,cant inherit or override static method defined in an interface(could happen if it were a class)
    }


class MyClass implements B1 {//we have to override method5(), if class impements interface then it must override its abstract method
    public void method1() {
        System.out.println("javaOOPs.MyClass: method1");
    }
    public void method4() {
        System.out.println("javaOOPs.MyClass: method4");
    }
    @Override
    public void method2(){//here i overrode the method2, it could also be inherited(auto gets)here used public bec default cant be used in class
        System.out.println("my class ; method2");
    }
    public void method5(){
        System.out.println("my class: method5");
    }

}
public class InheritanceInInterface {
    public static void main(String[] args) {
        A1.method3();// can be accessed InterfaceName.methodName();
MyClass obj = new MyClass();
obj.method1();
obj.method2();//javaOOPs.MyClass implements javaOOPs.B1, so it inherits the overridden method2() from javaOOPs.B1, not the original one from javaOOPs.A1. output: (B: method2)
//obj.method3();it could happen if javaOOPs.A1 was a class
obj.method4();
obj.method5();
        System.out.println(A1.X);

    }
}

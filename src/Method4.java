public class Method4 {
    public static void greet() {
        System.out.println("Hello from Helper!");
    }
}
class MainClass {
    public static void main(String[] args) {
        //here u are calling the method from diff class, so the syntax of calling it is,(here className is of that class which has the method
        //className.methodName();
        Method4.greet(); // ✅ No object needed///
        //if the method is non static , then it call it after making the object, and to make object use  syntax,(className is of the clas which has method
        //clasName variable = new ClassName();
        //tocall the method, syntax is(here variable is varriable of object we created)
        //variable.methodName();
    }
}

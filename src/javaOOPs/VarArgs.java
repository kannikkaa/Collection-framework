package javaOOPs;

public class VarArgs {
    public static void greet(String... names) {
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
        String message = "";
        for (String name : names) {
            message += "Hello, " + name + " /";
        }
        System.out.println(message.trim());
    }
    public static void main(String[] args) {
        greet("Aman", "Kanika", "Ravi");
        greet("Neha");
        greet();
    }


}

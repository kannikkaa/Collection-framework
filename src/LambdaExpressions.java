@FunctionalInterface
interface Sum1 {
void add(int a, int b);

}
    public class LambdaExpressions {
    public static void main(String[] args) {
     Sum1 s = (a, b)-> System.out.println(a+b);
        s.add(10, 20);
    };

    }

// -> this is lambda expression, can use either anonymous class or lambda expression, Use lambda expression when there is only 1 abstract method, when
//working with interfaces and there r more than  1 methods then use anonymous class,
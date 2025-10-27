package loops;

public class WhileLoop{
   public static int length(int number){
       int count = 0;
    while(number != 0){
        number /= 10;
        count++;
    }
    return count;
   }

    public static void main(String[] args) {
        int number=87777777;
        System.out.println(length(number));
    }
}

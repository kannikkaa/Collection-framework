public class P1 {
    //using recursive.recursion
  public static int add(int[]numbers) {
      int n = 0;
      for (int i = 0; i <numbers.length; i++) {
          n += numbers[i];
      }
      return n;
  }
    public static void main(String[] args) {
        int[] numbers = {47, 67, 55};
        System.out.println(add(numbers));

    }
}

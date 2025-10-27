package loops;

public class foreachloop {
    public static void main(String[] args) {
        //3 ways to create arrays
        //1st(declaring and memory allocation in heap in jvm
        int[] marks1 = new int[5];
        //2nd
        int[] marks; //declaring
        marks = new int[5]; //memory allocate
        marks[0] = 76; //initialization
        marks[1] = 65;
        marks[2] = 98;
        marks[3] = 57;
        marks[4] = 83;
        System.out.println(marks[3]);
        //3rd (declaration, memory allocation, initialization together)
        int[] marks2 = {78, 98, 56, 73, 49};
        System.out.println(marks2.length);
        //for loop to display the array(efficient way) here i=index in the array(marks2[0] = 78)
        for (int i = 0; i<marks2.length; i++) {
            System.out.println(marks2[i]+" ");
            //iterating each element in the array is called array traversal
        }
        for(int j=(marks2.length-1); j>=0; j--){
            System.out.print(marks2[j]+" ");
            System.out.println("hello");
        }
        //for each element
        for(int element : marks){
            System.out.println(element);
        }

    }
}

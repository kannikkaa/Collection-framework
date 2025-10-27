public class Method5 {
    static void change(int[] arr) {
        arr[0] = 98;
    }

    public static void main(String[] args) {
        int[] marks = {94, 78, 87, 69, 98};
        change(marks);
        System.out.println(marks[0]);
    }
}
   //when int, double(primitive data types are passed as input, then they are passed as by value(copy goes to the method to perform logic on them),
    //there method cant change original value
    //but in case of non-primitive data types(arrays, list, object), copy of address goes, so i make any changes in method to that input, it changes the
   // original value
//non primitive pass by reference(copy of address)
//primitive data types pass by value(copy)


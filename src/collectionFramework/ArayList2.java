package collectionFramework;

import java.util.ArrayList;

public class ArayList2 {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Mango");
        s2.add("Orange");
        s2.add("Pineapple");
        System.out.println(s1);
        s1.addAll(s2);
        System.out.println(s1);
        s1.add(2, "Grapes");
        System.out.println("After inserting Grapes at index 2: "+s1);
    }
}

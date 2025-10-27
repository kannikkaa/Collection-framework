package collectionFramework;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkdList1 {//use linkedist for fast access, but slow insertion/deletion

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.addFirst("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");
        System.out.println("Original list: " + animals);
        animals.removeLast();
        System.out.println("After removeLast() " + animals);
        animals.push("Bear");
        System.out.println("After push() " + animals);
        System.out.println("Polled element: " + animals.poll());
        System.out.println("After poll " + animals);
        System.out.println("Poll first: " + animals.pollFirst());
        System.out.println("Poll last: " + animals.pollLast());
        System.out.println("Peek first: " + animals.peekFirst());
        System.out.println("Peek last: " + animals.peekLast());
        System.out.println(animals);
        Iterator<String> reverseIt = animals.descendingIterator();
        while (reverseIt.hasNext()) {
            System.out.print(reverseIt.next() + " ");
        }
        System.out.println();
        System.out.println("Size of list: " + animals.size());
        animals.set(0, "Deer");
        System.out.println(animals);
        animals.offer("Giraffe");
        System.out.println("After offer() " + animals);
        System.out.println("Peek head: " + animals.peek());
        System.out.println("Index of Tiger is: " + animals.indexOf("Tiger"));
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Contains elephant? " + animals.contains("Elephant"));
        System.out.println("Final linked list: " + animals);
        System.out.println(animals.get(2));//to  get element by using index

    }
}

package collectionFramework;

import java.sql.SQLOutput;
import java.util.ArrayDeque;

public class ArrayDequ {//cant access elements using index number
    public static void main(String[] args) {
        ArrayDeque<String> tasks = new ArrayDeque<>();
        tasks.addFirst("Urgent task");
        tasks.add("task 1");
        tasks.add("task 2");
        tasks.addLast("Low priority task");
        System.out.println("Initial task queue: "+tasks);
        System.out.println("First task: "+tasks.peekFirst());
        System.out.println("Last task: "+tasks.peekLast());
        System.out.println("Removing: "+tasks.pollLast());
        System.out.println("removing: "+tasks.pollFirst());
        System.out.println("Queue after poll first and poll last "+tasks);
        tasks.push("StackTask2");
        tasks.push("StackTask1");
        System.out.println("After pushing stack tasks: "+tasks);
        System.out.println("Pop: "+tasks.pop());
        System.out.println("Final task queue: "+tasks);
        try{
            tasks.add(null);
    } catch(NullPointerException e){
            System.out.println("cant insert null to array deque");
        }
    }
}

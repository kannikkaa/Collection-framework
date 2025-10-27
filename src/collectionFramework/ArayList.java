package collectionFramework;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Iterator;

public class ArayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(15);//making arraylist which contain only integers, stored in l1 variable
        l1.add(5);
        l1.add(3);
        l1.add(7);
        l1.add(7);
        l1.trimToSize();
        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
        }
            System.out.print(l1.clone());
            System.out.println(l1.contains(3));//returns true if that element is present in the arraylist
            System.out.println(l1.equals(4)); // returns true if this element is present in the arraylist
            System.out.println("At index 1, element present is: "+l1.get(1));//get(index 1), returns element present at ths index
            System.out.println(l1.hashCode());
            System.out.println(l1.indexOf(7));// returns index if the input is present in the arraylist, if no present then return -1
            System.out.println(l1.isEmpty());//checks if arraylist is empty or not
           // System.out.print(l1+" , ");//print the list
            Iterator it = l1.iterator();
            while(it.hasNext()){//chcks if next element is present
                System.out.print(it.next()+" , ");//prints the next element
            }
            l1.set(1, 10);//replace element present at 2nd index, with 10



    }

}

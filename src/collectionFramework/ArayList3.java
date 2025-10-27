package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArayList3 {//use arraylist for fast insertion/deletion, not for fast access
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Red", "Yellow", "Blue", "Red"));
        System.out.println("Color List: "+s1);
        System.out.println("First index of red: "+s1.indexOf("Red"));
        System.out.println("Last index of red: "+s1.lastIndexOf("Red"));
        System.out.println("Contains Green? "+s1.contains("Green"));
        int count =0;
        for(String color: s1){
            if(color.equals("Red")){
                count++;
            }
        }
        System.out.println("Frequency of Red: "+count);
        for(int i=0; i<s1.size(); i++){
            if(s1.get(i).equals("Red")){
               s1.set(i, "Pink");
            }
        }
        System.out.println(s1);
        Iterator<String> it = s1.iterator();
        while(it.hasNext()){
            if(it.next().equals("Blue")){
                it.remove();
            }
        }
        System.out.println("List after removing blue: "+s1);
    }
}

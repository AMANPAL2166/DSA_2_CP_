package ArrayList_;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {
    public static void main(String[] args) {
        //It's unordered list, allowed duplicates
        List<String> li = new ArrayList<>();
        li.add("C++");
        li.add("Java");
        li.add("C++");
        System.out.println("List after add items with some duplicates: ");
        for(String s: li){
            System.out.println(s);
        }
        System.out.println("List after updatetation:  ");
        //Updating element
        li.set(1,"Best programming language");
        for(String s: li){
            System.out.println(s);
        }
        System.out.println("Searching element in list: ");
        //Searching element
        System.out.println("First element in list: " + li.get(1));
        System.out.println("Second element in list: " + li.get(2));
        //Removing element from list
        System.out.println("Removing element from the list: ");
        li.remove("Java");
        System.out.println("List after removed Java: ");
        for(String s: li){
            System.out.println(s);
        }

    }
}

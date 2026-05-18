package ArrayList_;

import java.util.ArrayList;
import java.util.Collection;

public class Framework {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Initial Fruit list: " + fruits);
        fruits.add("Graphs");
        fruits.add("Guvava");
        fruits.remove("Apple");
        System.out.println("After remove apple: " + fruits);
        Collection<String> addFruits = new ArrayList<>();
        addFruits.add("Papaya");
        addFruits.add("Mango");
        fruits.addAll(addFruits);
        System.out.println("Fruit list after add: " + fruits);
    }
}

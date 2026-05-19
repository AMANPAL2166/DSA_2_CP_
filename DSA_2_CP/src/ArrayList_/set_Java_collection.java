package ArrayList_;

import java.util.Set;
import java.util.TreeSet;

public class set_Java_collection {

    void insert(Set<Integer> s, int x) {
        // Your code here
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s) {
        Set<Integer> sorted = new TreeSet<>(s);
        // Your code here
        for(int i: sorted){
            System.out.print(i + " ");
        }
    }

    /*erases an element x from the set s */

    void erase(Set<Integer> s, int x) {
        // Your code here
        s.remove(x);
    }


    /*returns the size of the set s */
    int size(Set<Integer> s) {
        // Your code here
        return s.size();
    }


    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x) {
        // Your code here
        if(s.contains(x)){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}

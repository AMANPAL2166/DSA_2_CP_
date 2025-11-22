package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(33);
        queue.add(55);
        System.out.println(queue);
        queue.add(99);
        System.out.println(queue);
        queue.add(35);
        System.out.println("Remove here first queue: "+queue.remove());
        System.out.println("Print all the queue after remove first element: "+queue);
        System.out.println("Remove here second queue: "+queue.remove());
        System.out.println("Print all the queue after second element remove: "+queue);
        System.out.println("Print peek element of the queue: " + queue.peek());
    }
}

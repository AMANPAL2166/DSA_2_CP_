package Daily_Doze;

import java.util.PriorityQueue;

public class BsicsOfHeap {
    ///  It's a binary tree data structure, who can find max&min element very quickly.
    // There are two types of binary head::: 1) Min heap:::: 2) Max heap
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(22);
        pq.add(1);
        pq.add(0);
        System.out.println(pq);//Print whole queue
        int i = pq.poll();//smallest element in the queue
        System.out.println(i);//Print
    }
}

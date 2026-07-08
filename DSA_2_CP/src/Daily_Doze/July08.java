package Daily_Doze;

import java.util.HashMap;

public class July08 {
    class Node{
        int val;
        int key;
        Node next, prev;
        Node(int k, int v){
            key = k;
            val = v;
        }
    }
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node  head, tail;
    //chache function
    public void LRUChache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    //remove function
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    //insert function
    private void insert(Node node){
        node.next = head.next;
    }
}

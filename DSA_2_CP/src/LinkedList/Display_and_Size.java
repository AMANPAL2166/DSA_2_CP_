package LinkedList;

import org.w3c.dom.*;

public class Display_and_Size {
    public static class SinglyLinkedList {
        static class Node {
            int data;
            Node next;
            Node(int d) { data = d; next = null; }
        }

        Node head;
        Node tail;
        int size;  // Track size

        public SinglyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public void addFirst(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void addLast(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public int size() {
            return size;
        }
        //Display Linkedlist
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print (temp.data +" ");
                temp = temp.next;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(33);
        System.out.println("Size of the Linkedlist " + list.size);
        list.addLast(44);
        System.out.println("Size of the Linkedlist " + list.size);
        list.addLast(34);
        System.out.println("Size of the Linkedlist " + list.size);
        list.addLast(14);
        System.out.println("Size of the Linkedlist " + list.size);
        list.addLast(2);
        System.out.println("Size of the Linkedlist " + list.size);
        list.display();
    }

}

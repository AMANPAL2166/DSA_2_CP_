package LinkedList;

import org.w3c.dom.*;

public class add_Last {
    // Node class for linked list
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head; // head of list
    Node tail; // tail of list to optimize addLast to O(1)

    // Constructor
    public add_Last() {
        head = null;
        tail = null;
    }

    // Add element at the end of the list
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print elements of the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Test main function
    public static void main(String[] args) {
        add_Last list = new add_Last();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.print("Linked list elements: ");
        list.display();
        // Expected output: 10 20 30
    }
}

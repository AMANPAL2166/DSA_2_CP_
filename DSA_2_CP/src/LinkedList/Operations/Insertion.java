package LinkedList.Operations;

public class Insertion {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    //Insert a Node at the Front/Beginning of the Linked List
    public static Node insertAtfront(Node head, int x){
        Node list = new Node(x);
        list.next = head;
        return list;
    }
    //Print function
    public static void PrintLinkedlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print("->");
            }
            //update current
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node list = new Node(2);
        list.next = new Node(33);
        list.next.next = new Node(22);
        int key = 44;
        PrintLinkedlist(list);
        list = insertAtfront(list, key);
        PrintLinkedlist(list);

    }
}

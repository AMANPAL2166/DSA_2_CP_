package LinkedList;

public class deleteWithoutHead {
    public static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public  static void deleteNode(Node del_node) {
        // code here
        //Insure that node to be deleted is not the last node
        if(del_node == null || del_node.next == null){
            return;
        }//Copy data from the next node into the current node
        Node temp = del_node.next;
        del_node.data = temp.data;
        //Link current node to the node after the next node
        del_node.next = temp.next;
        //Delete the next node
        temp.next = null;


    }
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating a linked list: 4 -> 5 -> 6 -> 7 -> 8
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);

        deleteNode(head);

        printList(head);
    }
}

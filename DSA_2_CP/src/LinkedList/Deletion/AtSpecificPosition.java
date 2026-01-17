package LinkedList.Deletion;

public class AtSpecificPosition {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    //Print
    public static void PrintLinkedlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print (curr.data);
            if(curr.next != null){
                System.out.print ("<->");
            }
            //update curr
            curr = curr.next;
        }
    }
    public static Node DeleteAtSpecific(Node head, int x){
        //Create a temp variable
        Node temp = head;
        //Check if x is one then remove head
        if(x == 1){
            head = temp.next;
            return head;
        }
        //Traverse to the node before the one to be deleted
        //create a prev variable
        Node prev = null;
        for(int i = 1;i<x; i++){
            prev= temp;
            temp = temp.next;
        }
        //Delete the node at the position
        prev.next = temp.next;
        return head;

    }
    public static void main(String[] args) {
         Node newlist = new Node(1);
         newlist.next = new Node(2);
         newlist.next.next = new Node(3);
         newlist.next.next.next = new Node(4);

         int key  = 4;
         newlist = DeleteAtSpecific(newlist, key);
         PrintLinkedlist(newlist);

    }

}

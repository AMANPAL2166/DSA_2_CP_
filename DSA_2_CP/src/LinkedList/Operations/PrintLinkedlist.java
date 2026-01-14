package LinkedList.Operations;

public class PrintLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;

        }
    }
    public static void printlinkedlist(Node head){
        //a loop will run till head is null
        while(head !=null){
            //print the data of current node
            System.out.print (head.data);
            if(head.next != null){
                System.out.print("->");
            }
            //moving the next node
            head = head.next;
        }
    }
    public static void printLinkelist2(Node head){
        //Recursive method
        //base case
        if(head == null){
            return;
        }
        System.out.print(head.data);
        if(head.next != null);
        System.out.print ("->");
        //Moving to the next node
        printLinkelist2(head.next);
    }

    public static void main(String[] args) {
        //create a new node
        Node list = new Node(10);
        list.next = new Node(11);
        list.next.next = new Node(12);
         printlinkedlist(list);
        System.out.println();
         printLinkelist2(list);

    }
}

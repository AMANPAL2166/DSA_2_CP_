package LinkedList;

public class Linked_List {
    public static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }

    }
    public static Node head;
    public static Node tail;
//------------Print function--------------
    public void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print (curr.data);
            if(curr.next != null){
                System.out.print ("->");
            }
            //update currant
            curr = curr.next;
        }
    }
//    public static Node head;
//    public static Node tail;
//------------Insert data at head---------
    public void   addFirst(int data ){
        //Step 1st - Create new node
        Node newlist = new Node(data);
        //Base case, if our list is empty
        if(head == null){
            head = tail  = newlist;

        }

        //Step 2 - Assign newlist next = head;
        newlist.next = head;//Linking step
        //Step 3 - newlist = head;
        newlist = head;


    }
    public void addLast(int data){
        //Step 1 : Create a new Node
        Node newNode = new Node(data);
        /// Check base cases

        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2: link newNode.next = tail;
        newNode.next  =tail;
        //Step 3: assign tail = newNode
        tail = newNode;
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.head = new Node(1);
        head.next = new Node(2);
        ll.addFirst(0);
        ll.print( );

    }

}

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
    public void print( ){//O(n)--because, it goes all the element of list.
        Node curr = head;
        while(curr != null){
            System.out.print (curr.data+"->");

            //update currant
            curr = curr.next;
        }
        System.out.println();
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
            return;

        }
        //Step 2 - Assign newlist next = head;
        newlist.next = head;//Linking step
        //Step 3 - newlist = head;
        head = newlist;
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
        tail.next  =newNode;
        //Step 3: assign tail = newNode
        tail = newNode;
    }
    public void add(int idx, int data){
        //If idx = 0;
        if(idx == 0){
            addFirst(data);
            return;
        }
        //Create a new node
        Node newNode = new Node(data);
        //create a variable to store temp value
        Node temp = head;
        int i = 0;
        while(i<idx -1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp = temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print( );
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2, 30);
        ll.print();

    }

}

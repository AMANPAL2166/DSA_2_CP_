package LinkedList;

//import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

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
    //new static size
    public static int new_size;
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
        new_size++;
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
        new_size++;//update size of linkedlist
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
        new_size++;
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
    public void size(){
        int i = 0;
        while(head != null){
            head = head.next;
            i++;
        }
        System.out.println(i);
    }
    public int remonvefirst(){
        if(new_size == 0){
            System.out.println("List is empty.");
           return Integer.MIN_VALUE;
        } else if (new_size == 1) {
            int val = head.data;
            head = tail = null;
            new_size=0;
            return val;
            
        }
        int val = head.data;
        head = head.next;
        new_size++;
        return val;


    }
    public int removelast(){
        //base case
        if(new_size == 0){
            System.out.println("List is empty.");
            return 0;
        } else if (new_size ==1) {
            int val = head.data;
            head = tail = null;
            new_size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i<new_size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;//tail
        prev.next = null;
        tail = prev;
        new_size--;
        return val;
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
        ll.remonvefirst();
        ll.print();
        ll.removelast();
        ll.print();


    }

}

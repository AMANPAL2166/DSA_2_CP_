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
    public static void print(Node head){
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
    static Node insertFirst(int data ){
        //Step 1st - Create new node
        Node newlist = new Node(data);
        //Base case, if our list is empty
        if(head == null){
            head = tail  = newlist;
            return newlist;
        }

        //Step 2 - Assign newlist next = head;
        newlist.next = head;//Linking step
        //Step 3 - newlist = head;
        newlist = head;
        return head;

    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        Node newList = new Node(88);
        newList.next = new Node(33);
        newList = insertFirst(22);
        print(newList);

    }

}

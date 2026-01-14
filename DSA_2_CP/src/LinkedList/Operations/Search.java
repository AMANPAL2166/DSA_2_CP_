package LinkedList.Operations;

public class Search {
    static  class Node{
        int data;
        Node next;
        //constructor
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static boolean search(Node head, int key) {
        Node curr = head;
        //iterate over the nodes
        while(curr != null) {
            //if we find key equal to the current data, then return true
            if(curr.data == key){return true;}
            //move to the next node
            curr = curr.next;
        }
        return false;

    }
    public static boolean search2(Node head, int key){
        //Recursive method
        //base case
        if(head == null){
            return false;
        }
        //if key is present in the current node return true
        if(head.data ==key){
            return true;
        }
        //recurr for remaining list
        return search2(head.next, key);
    }

    public static void main(String[] args) {
        //create a object of node
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next= new Node(4);
        list.next.next.next.next = new Node(5);

        //Key to search in linkedlist
        int key = 50;
        if(search2(list,key)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }


    }


}

package LinkedList;

public class get_nth_node {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    static int getdata(Node head, int index){
        //check empty node
        if(head == null){
            return -1;
        }
        //if list have only one node
        if(index == 1){
            return head.data;
        }
        //recursive approach
        int current = 1;
        while(head != null){
            if(current == index){
                return head.data;
            }
            //update current
            current++;
            head = head.next;
        }
        //return -1, if didn't get any index
        return -1;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int index =9;
        int curent = getdata(head, index);
        if(curent!=-1){
            System.out.println("Element at index  "+index + " is " + curent);
        }else{
            System.out.println("Index " + index + " is out of bound.");
        }

    }
}

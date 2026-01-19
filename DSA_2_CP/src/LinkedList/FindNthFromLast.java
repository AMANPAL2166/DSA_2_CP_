package LinkedList;

public class FindNthFromLast {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data= new_data;
            next = null;
        }
    }
    static int getNode(Node head, int key){
        int len = 0,i;
        //variable to store copy of head
        Node temp = head;
        //count the number of node in linkedlist
        while(temp != null){
            temp = temp.next;
            len++;
        }
        //Check if value of N is not more than the length of linkedlist
        if(len<key){
            return -1;

        }
        temp = head;
        //get the (len-key+1)th node from the beginning
        for(int j =1;j<len-key+1;j++){
            temp  = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 35 -> 15 -> 4 -> 20
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        // Function Call to find the 4th node from end
        System.out.println(getNode(head, 2));
    }


}

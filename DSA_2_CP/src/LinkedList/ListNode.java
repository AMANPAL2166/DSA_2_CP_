package LinkedList;

public class ListNode {
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
    //Two Pointer
    static int getNode2(Node head, int key){//
         //Create two pointer main_ptr and ref_ptr initially point head
        Node main_ptr = head;
        Node ref_ptr = head;
        //Move ref_ptr to the N-th node from from beginnig
        for(int i = 1; i<key;i++){
            ref_ptr = ref_ptr.next;
            //If ref_ptr reached to the null it means key>length of linkedlist
            if(ref_ptr==null){
                return -1;
            }
        }
        //Move ref_ptr and main_ptr by one node until
        //ref_ptr reaches last node of the list
        while(ref_ptr.next != null){
            ref_ptr = ref_ptr.next;
            main_ptr =  main_ptr.next;
        }
        return main_ptr.data;

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
        System.out.println(getNode2(head, 2));
    }


}

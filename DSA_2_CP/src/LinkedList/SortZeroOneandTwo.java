package LinkedList;

public class SortZeroOneandTwo {
    static class  Node{
        int data;
        Node next;
        Node(int new_data){
            data  = new_data;
            next = null;
        }
    }
    static void sort(Node head){
        //Initialize count of 0, 1, and 2;
        int[] count = {0,0,0};
        Node ptr = head;
        //Traverse and count total number of 0's, 1's and 2's
        //count[0] will store 0's
        //count[1] will store  1's
        //count[2] will store 2's
        while(ptr != null){
            count[ptr.data] += 1;
            ptr = ptr.next;
        }
        int idx = 0;
        ptr = head;
        //Fill first count[0] nodes with value 0
        //Fill next count[1] nodes with value 1
        //Fill remaining count[2] nodes with value 2
        while(ptr  != null){
            if(count[idx] ==0){
                idx += 1;
            }else{
                ptr.data = idx;
                count[idx] -= 1;
                ptr = ptr.next;
            }

        }
    }
    static void  print(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print (temp.data);
            if(temp.next != null){
                System.out.print ("->");
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 1 -> 2 -> 1 -> 0 -> NULL
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.print("Linked List before Sorting:");
        print(head);

        sort(head);
        System.out.println();

        System.out.print("Linked List after Sorting:");
        print(head);
    }
}

package LinkedList.Easy_Problems;
//Question says::- Given linked list, the task is to remove every kth node of the linkedlist. Assume that
// K is always less than or equal to the linkedlist.
//Input: LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2
//Output: 1 -> 3 -> 5
//Explanation: After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 .



public class RemoveEveryKthNode {
    static  class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    static Node deletenth(Node head, int key){
        Node curr = head;
        Node prev = null;
        int count =0;
        while(curr != null){
            count++;
            if(count%key== 0){
                //skip the current node
                //If prev != null
                if(prev != null){
                    prev.next = curr.next;
                }else{
                    head = curr.next;
                }
            }else {
              //Update previous node pointer only if we do not remove the node
                prev = curr;

            }
             curr = curr.next;

        }
        return head ;
    }
    //print function
    static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(head.next != null){
                System.out.print ("<->");
            }
            //update curr
            curr = curr.next;

        }
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 35 -> 15 -> 4 -> 20
        Node head = new  Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        int key = 1;
        head = deletenth(head,key);
        print(head);
    }
}

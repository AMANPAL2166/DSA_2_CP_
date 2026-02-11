package LinkedList;

public class RemoveNthFromEnd {
    static class  ListNode{
        int data;
        ListNode next;
        ListNode(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {

         int size = Nodesize(head)-n;
         if(size ==0){
             return head.next;
         }
         ListNode temp = head;
         for(int i = 1; i<size; i++){
             temp = temp.next;
         }
         //remove the node
        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
         return head;

    }
    static int Nodesize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    static void print(ListNode head){
        ListNode temp = head;
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
        // 35 -> 15 -> 4 -> 20
        ListNode head = new  ListNode (35);
        head.next = new ListNode (15);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(20);

        // Function Call to find the 4th node from end
//       print(head);
       removeNthFromEnd(head, 2);
       print(head);

    }
}

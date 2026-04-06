package NEETCODE.LINKED_LIST;

public class Reverse {
    public class ListNode {
        int val;
        ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = null;
        while(temp!= null){
            //stroring previous link
            front = temp.next;
            temp.next = prev;
            //move pointer to the next
            prev = temp;
            temp = front;

        }
        return prev;

    }
}

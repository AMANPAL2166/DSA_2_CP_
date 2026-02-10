package LinkedList;

public class LinkedlistCycle {
    public class ListNode{
        int data;
        ListNode next;
        ListNode(int new_data){
            data = new_data;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }
}

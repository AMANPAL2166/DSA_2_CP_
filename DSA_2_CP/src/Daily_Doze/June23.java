package Daily_Doze;

public class June23 {
    //make class of a linkedlist
    static class ListNode{
        int val;
        ListNode next;
        //constructor
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    //create method to solve rotate linkedlist
    public ListNode rotateRight(ListNode head, int k) {
        //edge cases: empty list, single node,  or no rotation needed
        if(head == null || head.next  == null || k==0) return head;
        //Step1: get length of listnode
        int length = lengthOfNode(head);
        //Step2: Implement optimization formula
        k= k%length;
        /// edge case
        if(k== 0) return head;
        //Step3: Connect tail to head
        /// Find tail
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        /// make circular linkedlist
        tail.next = head;
        //Step4: Find new tail
        ListNode newTail = head;
        for(int i = 0;i<length-k-1; i++){
            newTail = newTail.next;
        }
        //Step5: Get new head;
        ListNode newHead = newTail.next;
        //Step6: Break the circle
        newTail.next = null;
        return newHead;

    }

    private int lengthOfNode(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next  = new ListNode(3);
        list.next.next  = new ListNode(4);
    }
}

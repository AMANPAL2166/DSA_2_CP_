package NEETCODE.LINKED_LIST;

public class Reverse {
    public static class ListNode {
        int val;
        ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static ListNode reverseList(ListNode head) {
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

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
    }

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseList(head);
        printList(head);
    }

}

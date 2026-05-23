package LinkedList;

public class IntersectionOfTwoLinkedLIst {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
           val = data;
           next = null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null|| headB == null)return null;
       ListNode pA = headA;
       ListNode pB = headB;
       while(pA != pB){
           pA = (pA == null) ? headB: pA.next;
           pB  = (pB == null)? headA: pB.next;
       }
       return pA;
    }

    public static void main(String[] args) {
        ListNode li = new ListNode(1);
        li = new ListNode(2);


    }
}

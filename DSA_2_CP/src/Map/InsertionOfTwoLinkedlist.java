package Map;

import java.util.ArrayList;
import java.util.HashSet;

public class InsertionOfTwoLinkedlist {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
           val = x;
           next = null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = headA;

        while(curr != null){
            set.add(curr);
            curr = curr.next;
        }
        curr = headB;
        //check element in headB
        while(curr != null){
            if(set.contains(curr)){
                return  curr;
            }
            curr = curr.next;
        }
        return null;

    }
    //Make a function to check, does k exit or not?
    public static boolean hasK_nodes( ListNode head, int k){
        ListNode curr = head;
        int count = 0;
        while(curr != null && count<k){
            count++;
            if(count == k) return true;
            curr = curr.next;
        }
        return false;
    }
    //Reverse fisrt k nodes

    private ListNode reverseFirstKNodes(ListNode head, int k){
        ListNode prev = null;
        ListNode curr = head;
        while(k>0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev;

    }
    //Return node after kth node
    private ListNode getKthNext(ListNode head, int k){
        ListNode curr = head;
        while(curr != null && k>0){
            curr = curr.next;
            k--;

        }
        return curr;
    }
    public   ListNode reverseKGroup(ListNode head, int k){
        /// Check k nodes hai ki nhi
        if(!hasK_nodes(head, k)){
            return head;
        }
        //reverse firth kth nodes
        ListNode newHead = reverseFirstKNodes(head, k);
        //Now head become tail
        ListNode nextGroup = getKthNext(head, k);
        head.next = reverseFirstKNodes(head, k);
        return newHead;
    }
}

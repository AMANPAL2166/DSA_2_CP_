package Daily_Doze;

import LinkedList.LinkedlistCycle;

import java.util.ArrayList;

public class June19 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        //Create a Arraylist to store all elements into it
        int size = sizeOfNodes(head);

        int[] storeNodes = new int[size];
        int i = 0;
        ListNode curr = head;
        while(curr != null){
            storeNodes[i] = curr.val;
            i++;
            curr = curr.next;
        }
        //check, is it palindrome or not?
          i = 0;
        int j = storeNodes.length-1;
        while(i<=j){
            if(storeNodes[i] != storeNodes[j]){
               return false;
            }
            i++;
            j--;

        }
        return true;
        ///  Time: O(n);
        /// Space: O(n);
        //Can we optimized this?
        /// / Yes -- Using two slow and fast pointer
    }
    private static int sizeOfNodes(ListNode head ){
        int size = 0;
        ListNode curr = head;
        while (curr != null){
            size++;
            curr  = curr.next;
        }
        return size;
    }
    //Optimized space complexity
    public boolean isPalindrome_(ListNode head){
        //edge case
        if(head == null || head.next == null) return true;
        //find middle of the elemetn
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Reverse the half of the linkedlist
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = slow;
        while(secondHalf!= null){
            if(secondHalf.val  != firstHalf.val){
                return false;
            }

        }
        return true;

    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr  = next;
        }
        return prev;
    }
    //method to find node cycle of the linkedlist.
    private static ListNode  detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){//here cycle found
                ListNode ptr = head;
                while(ptr != slow){
                    ptr = ptr.next;
                    slow = slow.next;

                }
                return ptr;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        //check, this linkedlist is palindrome or not?
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));

    }
}

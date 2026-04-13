package NEETCODE.LINKED_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSorted {
    public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        //Create a list to store val of node
        List<Integer> vals = new ArrayList<>();
        //Collect all the values into a starndard
        for(ListNode list: lists){
            while(list!= null){
                vals.add(list.val);
                list = list.next;
            }
        }
        //Sort the vals
        Collections.sort(vals);
        //Reconstruct the sorted linked list
        ListNode dummy = new ListNode(0);
        ListNode current= dummy;
        for(int v: vals){
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    public ListNode mergeKLists_(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return divideAndConquer(lists, 0, lists.length - 1);
    }

    private ListNode divideAndConquer(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l1 = divideAndConquer(lists, left, mid);
        ListNode l2 = divideAndConquer(lists, mid + 1, right);
        return mergeTwo(l1, l2);
    }

    // Standard "Merge Two Sorted Lists" logic
    private ListNode mergeTwo(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
    /// Why this is "Better":
    /// Memory Efficiency: You aren't creating thousands of new ListNode objects or a massive ArrayList.
    /// You are just "rewiring" the .next pointers of the nodes that already exist.
    ///
    /// Interview Performance: If you tell an interviewer "I'll just throw them in a list and sort it," they'll usually ask "Can you do it without extra space?"
    /// This direct approach is the answer they are looking for.

}

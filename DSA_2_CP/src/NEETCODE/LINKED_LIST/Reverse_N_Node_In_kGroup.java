package NEETCODE.LINKED_LIST;

public class Reverse_N_Node_In_kGroup {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node helps handle the new head of the list easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;

        while (true) {
            // 1. Check if there are at least k nodes left
            ListNode kthNode = getKthNode(prevGroupTail, k);
            if (kthNode == null) break;

            ListNode nextGroupHead = kthNode.next;

            // 2. Reverse the group [currGroupHead ... kthNode]
            ListNode currGroupHead = prevGroupTail.next;
            ListNode prev = nextGroupHead; // Point the first node's next to the start of next group
            ListNode curr = currGroupHead;

            for (int i = 0; i < k; i++) {
                ListNode tempNext = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tempNext;
            }

            // 3. Connect the previous part to the new head of this reversed group
            prevGroupTail.next = kthNode;
            prevGroupTail = currGroupHead; // The old head is now the tail
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

}

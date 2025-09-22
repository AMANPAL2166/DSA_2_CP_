package Recurssion;

public class merge_two_sort {
    public static void main(String[] args) {

    }
    public <ListNode> ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node for simplicity
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining list
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }
}

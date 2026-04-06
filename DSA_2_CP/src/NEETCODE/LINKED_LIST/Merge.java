package NEETCODE.LINKED_LIST;

public class Merge {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create a dummy list to easy the work
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <=list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            //move pointer
            curr = curr.next;
        }
        //If any list left, append to the merge list
        if(list1 != null){
            curr.next = list1;

        }else{
            curr.next = list2;
        }
        return dummy.next;

    }
}

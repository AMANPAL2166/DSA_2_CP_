package NEETCODE.LINKED_LIST;

import java.util.HashMap;

public class CopyListRandom {
    static class ListNode{
        int data;
        ListNode random;
        ListNode next;
        ListNode(int new_data){
            data = new_data;
            next = null;
            random = null;
        }
    }
    public ListNode copyRandomList(ListNode head) {
        if(head == null ) return  null;
        HashMap<ListNode, ListNode> map = new HashMap<>();
        //copy nodes
        ListNode curr = head;
        while(head != null){
            map.put(curr, new ListNode(curr.data));
            curr =curr.next;
        }
        //set pointer
        curr = head;
        while(head!= null){
            ListNode copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);

    }

}


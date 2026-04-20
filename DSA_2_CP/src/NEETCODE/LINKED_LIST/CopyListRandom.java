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
//    Function copyRandomList(head):
//    If head is null: Return null
//
//    // Step 1: Create interweaved list (A -> A' -> B -> B')
//    curr = head
//    While curr is not null:
//    newNode = new Node(curr.val)
//    newNode.next = curr.next
//    curr.next = newNode
//            curr = newNode.next
//
//    // Step 2: Set random pointers for copy nodes
//    curr = head
//    While curr is not null:
//    If curr.random is not null:
//    curr.next.random = curr.random.next
//            curr = curr.next.next
//
//    // Step 3: Separate the two lists
//    curr = head
//            newHead = head.next
//    While curr is not null:
//    temp = curr.next
//    curr.next = temp.next
//    If temp.next is not null:
//    temp.next = temp.next.next
//            curr = curr.next
//
//    Return newHead

}


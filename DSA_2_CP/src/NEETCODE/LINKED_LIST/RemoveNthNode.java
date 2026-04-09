package NEETCODE.LINKED_LIST;

import LinkedList.ListNode;

public class RemoveNthNode {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int newdata){
            data = newdata;
            next = null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = NodeSize(head)-n;
        ListNode temp = head;
        for(int i = 1;i<size;i++){
            temp = temp.next;
        }
        //remoce node
        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
        return head;

    }
    public static int NodeSize(ListNode head ){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}

package NEETCODE.LINKED_LIST;

import LinkedList.ListNode;

public class Reorder {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int new_data){
             data = new_data;
             next = null;
        }

    }

//    public static int[] reOrder(int[] arr) {
//        int n= arr.length;
//        int left  = 0, right = n-1;
//        int[] newarr = new int[n];
//        for(int i = 0;i<n;i++){
//            if(i%2==0){
//                newarr[i] = arr[left++];
//            }else{
//                newarr[i] = arr[right--];
//            }
//        }
//        return newarr;
//
//    }
public void reorderList(ListNode head) {
    if(head == null) return;
    //Step 1: Find the middle of the list
    ListNode slow = head, fast = head;
    while(fast!= null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    //Step 2:Reverse the second half of the list
    ListNode second = slow.next;
    slow.next = null;
    ListNode node = null;

    while(second != null){
        ListNode temp = second.next;
        second.next = node;
        node = second;
        second = temp;
    }

    //Step 3: Merge the two halves
    ListNode first = head;
    second = node;
    while(second != null){
        ListNode temp1 = first.next, temp2 = second.next;
        first.next = second;
        second.next = temp1;
        first = temp1;
        second = temp2;
    }
}
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//        int[] ans = reOrder(arr);
//        for(int a: ans){
//            System.out.println(a + " ");
//        }
//    }

}

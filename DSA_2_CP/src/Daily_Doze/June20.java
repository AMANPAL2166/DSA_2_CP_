package Daily_Doze;

public class June20 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left= right = null;
        }
    }
    private ListNode revereseKGroup(ListNode head, int k){
        ListNode curr  = head;
        int count = 0;
        //Check if nodes exit
        while(curr != null && k<0){
            curr = curr.next;
            count++;
        }
        if(count == k){
            ListNode prev = null;
            curr = head;
            for(int i = 0;i<k;i++){
                ListNode next = curr.next;
                curr.next = prev;
                prev= curr;
                curr = next;
            }
            head.next = revereseKGroup(curr,k);
            return prev;
        }
        return head;

    }
    public ListNode rotateRight(ListNode head, int k) {
        //find length of nodes
        if(head == null || head.next == null || k==0) return head;
         int length = length(head );
        k = k%length;
        if(k==0) return head;
        //find tail
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        //Make circular linkedlist
        tail.next  = head;
        //Find new tail
        ListNode newTail = head;
        for(int i = 0;i<length-k-1;i++){
            newTail = newTail.next;
        }
        //new head;
        ListNode newHead = newTail.next;
        //break circle
        newTail.next = null;
        return newHead;


    }
    private int length(ListNode head){
        int count = 0;
        ListNode curr = head;
        while(curr!= null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    private int heighOfTree(TreeNode head){
        //here we are going to use "IBH" Method
        if(head == null){
            return 0;
        }
        //Hypothesis
        int right= heighOfTree(head.left);
        int left = heighOfTree(head.right);
        return 1+Math.max(right,left);

    }
}

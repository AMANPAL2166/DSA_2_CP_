package Daily_Doze;

import com.sun.source.tree.Tree;

import java.util.HashMap;

public class June25 {
    static class Node{
        int val;
        Node next;
        Node random;
        Node(int x){
            val= x;
            next = random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        //Base case
        if(head == null) return null;
        //Create HashMap
        HashMap<Node, Node> map = new HashMap<>();
        Node curr= head;
        //Create copies
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;//move pointer next
        }
        curr = head;//reinitialize
        //Connect next and random
        while(curr != null){
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;//move pointer

        }
        return map.get(head);

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        int localCount = 0;
        for(int i = 0;i<n;i++){

            if(nums[i] == 1){
                localCount++;
                maxCount = Math.max(maxCount, localCount);
            }else{
                maxCount = Math.max(maxCount, localCount);
                localCount = 0;
            }


        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }

}

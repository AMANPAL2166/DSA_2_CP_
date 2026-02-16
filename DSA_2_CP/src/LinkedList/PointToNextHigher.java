package LinkedList;

public class PointToNextHigher {
    static class Node{
        int data;
        Node next;
        Node arbitry;
        Node(int new_data){
            data = new_data;
            next = null;
            arbitry = null;

        }
    }
    //function to merge two sorted list
    public static Node SortedMerge(Node left, Node right){
        //If one list is empty, return the another
        if( left == null) return right;
        if(right == null) return left;

        Node result = null;
        Node curr = null;
        //Initialize result with the smaller node
        if(left.data <= right.data){
            result = left;
            left = left.arbitry;

        }else{
            result = right;
            right = right.arbitry;
        }
        curr = result;
        //merge the two lists;
        while(left != null && right != null){
            if(left.data <= right.data){
                curr.arbitry = left;
                left = left.arbitry;
            }else{
                curr.arbitry = right;
                right = right.arbitry;
            }
            curr = curr.arbitry;
        }
        //Attach remining nodes
        curr.arbitry = (left != null) ?left:right;
        return result;

    }
}

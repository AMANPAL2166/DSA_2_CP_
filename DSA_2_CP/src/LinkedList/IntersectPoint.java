package LinkedList;

import java.util.HashSet;

public class IntersectPoint {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next= null;
        }
    }
    static Node interset(Node head1, Node head2){
        //Iterate over second list and for each node
        //search in it first list
        while(head2 != null){
            Node temp  = head1;
            while(temp != null){
                //checking
                if(head2 == temp){
                    return head2;

                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    static Node insertOPT(Node head1, Node head2){
        //create hashset to store the element
        HashSet<Node> visulaList = new HashSet<>();
        //traverse the fist list and store the element
        while(head1 != null){
            visulaList.add(head1);
            head1 = head1.next;
        }
        //Traverse the second list to check
        while(head2 != null){
            if(visulaList.contains(head2)){
                //insertion point found
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {

        // creation of first list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);

        // 15 is the intersection point
        head2.next.next.next = head1.next;

        Node intersectionPoint = insertOPT(head1, head2);

        if (intersectionPoint == null)
            System.out.println("-1");
        else
            System.out.println(intersectionPoint.data);
    }
}

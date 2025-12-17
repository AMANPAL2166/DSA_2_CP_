package LinkedList;

public class BasicsOfLL {
    public static class Node {
        int data;//value
        Node next;//address of the next node
        Node(int data){
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(4);
        //System.out.println(a.next);//// Answer ::: -null
        Node b = new Node(33);
        a.next = b;//Here we are connecting node to each other.
       // System.out.println(a.next);//// Answer:: =LinkedList.BasicsOfLL$Node@5f184fc6
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(4);
        Node f = new Node(99);
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;



    }
}

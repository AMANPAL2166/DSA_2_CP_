package LinkedList;

public class isCycleExist {
    public static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static boolean iscylcle(Node head){
        //Initialize two pointer from head
        Node slow  = head;
        Node fast  = head;
        while(fast != null && fast.next != null){
            //move slow pointer with +1
            slow = slow.next;
            //move fast pointer with +2;
            fast  = fast.next.next;
            if(slow== fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        System.out.println(iscylcle(list));
        list.next.next.next = list.next;
        System.out.println(iscylcle(list));

    }
}

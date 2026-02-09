package LinkedList;

public class RemoveCycle {
    public   static  class Node{
        int data;
        Node next;
        Node(int new_data){
            data  = new_data;
            next = null;
        }

    }
    public static void RemoveCylclee(Node head){
        //detect cycle loop
        Node slow = head;
        Node fast = head;
        boolean iscylce = false;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                iscylce= true;
                break;
            }
        }
        if(iscylce == false){
            return ;
        }
        //find meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //Remove cylcle  -> last.next = null;
        prev.next = null;
    }

    public static void main(String[] args) {
        Node  list = new Node (1);
        list.next = new Node (2);
        list.next.next = new Node (3);
        RemoveCylclee(list);


    }
}

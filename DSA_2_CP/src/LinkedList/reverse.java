package LinkedList;

public class reverse {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    static int length(Node head){
        //counter
        int count = 0;
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    static Node reverselinkedlist(Node head){
        ///// //Use "Auxiliary Array"
       int n = length(head);
       int[] arr = new int[n];
       Node temp = head;
       int idx = 0;
       while(temp!= null){
           arr[idx++] = temp.data;
           temp = temp.next;//Now arr holds the list data in forward order
       }
       //Reset temp to the head to resign value
       temp = head;
       int idx2 = n-1;
       while(temp != null){
           temp.data = arr[idx2--];//assign from end to start
           temp = temp.next;
       }
       return head;
    }
    static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print (curr.data);
            if(curr.next != null){
                System.out.print ("<->");
            }
            //update curr
            curr = curr.next;

        }
    }
    //Three pointer iterative approach
    static Node reverse2(Node head){
        Node curr = head, prev = null,front  ;
        //Traverse all the node of linkedlist
        while(curr != null){
            ///store next
            front = curr.next;
           ///reverse curr node's next pointer
            curr.next = prev;
            ///Move pointers one position ahead
            prev = curr;
            curr = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node list = new Node(1);
        list.next  = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);
        print(list);
        list = reverse2(list);
        System.out.println();
        print(list);

    }

}

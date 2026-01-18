package LinkedList.Deletion;

public class DeleteALinkedlist {
    static  class  Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;

        }
        //Print function
        public static  void printLinkedlis(Node head){
            Node curr= head;
            while(curr!=null){
                System.out.print (curr.data);
                if(curr.next != null){
                    System.out.print ("<->");
                }
                //update curr
                curr = curr.next;
            }
        }

        public static void main(String[] args) {
            Node list = new Node(33);
            list.next = new Node(3);
            list.next.next = new Node(3);
            System.out.println("linkedlist before deleted ");
            printLinkedlis(list);
            System.out.println();
            System.out.println("Linkedlist after deleted ");
            //set head to null to remove the reference to the linkedlist.
            //This allows Java's garbage collector to automatically clean up
            //the memory used by nodes,as there are no more references to the nodes in the linkedlist.
            list = null;
            printLinkedlis(list);
            System.out.println("NULL");


        }
    }
}

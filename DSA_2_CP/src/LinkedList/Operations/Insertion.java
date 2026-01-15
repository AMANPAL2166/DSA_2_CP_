package LinkedList.Operations;

public class Insertion {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    //Insert a Node at the Front/Beginning of the Linked List
    public static Node insertAtfront(Node head, int x){
        Node list = new Node(x);
        list.next = head;
        return list;
    }
    //Function to insert a new node after given node
    public static Node insertAfter(Node head, int key, int new_data){
        //initialize a new pointer to current head
        Node curr = head;
        //Iterate over a linked list to find the key
        while(curr!=null){
            if(curr.data == key){
                break;
            }
            //update next
            curr = curr.next;
        }
        //If current become null, it means given key is not found in linkedlist
        if(curr == null){
            System.out.println("Node is not found");
            return head;
        }
        //Allocate the new Node and make the element to be inserted  as a new Node
        Node newNode = new Node(new_data);
        //set the next pointer of new node to the next pointer of given node
        newNode.next = curr.next;
        //Point the current node next to the new node
        curr.next = newNode;
        //return the head to the modified linkedlist
        return head;

    }
    //Print function
    public static void PrintLinkedlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print("->");
            }
            //update current
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node list = new Node(2);
        list.next = new Node(33);
        list.next.next = new Node(22);
        int key = 44;
        System.out.print("Linkedlist Before insertion: ");
        PrintLinkedlist(list);
        list = insertAtfront(list, key);
        System.out.print("Linkedlist After insertion: ");
        PrintLinkedlist(list);
        System.out.println("Insert new node in current Node");
        int new_key = 2;
        int New_data = 999;
        list = insertAfter(list,new_key,New_data );
        System.out.print("Insert at 2 node: " );
        PrintLinkedlist(list);

    }
}

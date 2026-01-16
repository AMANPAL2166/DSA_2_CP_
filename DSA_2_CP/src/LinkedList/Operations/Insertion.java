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
    //Function:: Insert a node in Linked List before a given node(Iterative approach)
    public static Node insertBeforeKey(Node head, int key, int new_data){
        //Special case: If the key is at head
        if(head == null){
            return null;
        }
        if(head.data == key){
            Node newNode = new Node(new_data);
            newNode.next = head;
            return newNode;
        }
        //Initialize current and previous pointers
        Node curr = head;
        Node prev = null;
        //Traverse the list to find the key
        while(curr !=null && curr.data != key){
            prev = curr;
            curr = curr.next;
        }
        //If the key was found
        if(curr!= null){
            Node newNode = new Node(new_data);
            prev.next = newNode;
            newNode.next = curr;
        }
        return head;


    }
    //Insert a node at a specific position
    public static Node insetPos(Node head, int pos, int val){
        if(pos<1){
            return head;
        }
        //head will change if pos=1
        if(pos == 1){
            Node newNode = new Node(val);
            newNode.next = head;
            return  newNode;
        }
        Node curr = head;
        //Traverse to the node that will be present just before the new node
        for(int i = 0;i<pos-1&& curr!= null; i++){
            curr = curr.next;
        }
        //If position is greater than the number of nodes
        if(curr == null){
            return head;
        }
        Node newNode =  new Node(val);
        //update the next pointer
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    //Insert at end
    public static Node insertatEnd(Node head, int val){
        //create a new node
        Node newNode = new Node(val);
        //If the linkedlist is empty, make the new node as the head and return
        if(head == null){
            return newNode;
        }
        //Store the head reference in a temporary variable
        Node last = head;
        //Traverse till the last node
        while(last.next != null){
            last = last.next;
        }
        //Change the next pointer of the last node to point to the new node
        last.next = newNode;
        //Return the head of the list
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
        System.out.println("Insertion before the key:");
        list = insertBeforeKey(list, new_key, New_data);
        System.out.print("New linkedlist:: ");
        PrintLinkedlist(list);
        int pos = 3;
        System.out.println("Insert node at " +pos + " position:");
        list = insetPos(list, pos, New_data);
        PrintLinkedlist(list);
        System.out.print ("Insert at last of the node:" );
        list = insertatEnd(list, New_data);
        PrintLinkedlist(list);
    }
}

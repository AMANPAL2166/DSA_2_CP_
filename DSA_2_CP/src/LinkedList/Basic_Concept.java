package LinkedList;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Basic_Concept {
    public static void main(String[] args) {
        //LinkedList class implementation:
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(44);
        list.add(99);
        list.add(0);
        System.out.println(list); // Print Linkedlist
        System.out.println(list.get(0));//Get element by index
        System.out.println(list.size());//Find size of the Linkedlist
        list.removeLast();//Remove last element;
        System.out.println(list);//Now check
//        list.add(3,33);//Add element by index
        System.out.println(list);//check
        //Note::-Here we can't add 33 on it because linkedlist size is 2. Soo we can only add from 1-2
        list.add(1, 44);
        System.out.println(list);
        list.add(2, 1999);
        System.out.println(list);
        System.out.println(list.size());//now check new size of Linkedlist

    }
    class LL{
        Node head;
        private int size;
        LL(){
            size = 0;
        }
        public class Node{
            String data;
            Node next;


         Node (String data){
            this.data= data;
            this.next = null;
            size++;
        }
    }
    public void addFirst (String data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }


}

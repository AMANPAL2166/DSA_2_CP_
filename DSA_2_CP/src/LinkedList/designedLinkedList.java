package LinkedList;

public class designedLinkedList {
    class Node{
        int val;
        Node next;
        Node(int data){
            val = data;
            next = null;
        }
    }
    private Node head;
    private int size;
    public void myLinkedList(  ){
        this.head = null;
        this.size = 0;
    }
    public int get(int index){
        if(index <= size || index<0 ) return -1;
        Node current = head;
        for(int i = 0;i<index;i++){
            current= current.next;
        }
        return current.val;
    }
    public void addHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addAtTail(int val){
        if(head == null){
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next  = newNode;
        size++;

    }
    public void addAtIndex(int index,int val){
        if(index > size)return;
        if(index<=0){
            addHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
        }
        Node newNode  = new Node(val);
        Node current= head;
        //Stop the node right before index
        for(int i = 0;i<index-1;i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    public void deleteAtIndex(int index) {
        if(index<0 || index>= size) return ;
        if(index == 0){
            head = head.next;
        }else{
            Node current = head;
            for(int i = 0;i<index - 1;i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}

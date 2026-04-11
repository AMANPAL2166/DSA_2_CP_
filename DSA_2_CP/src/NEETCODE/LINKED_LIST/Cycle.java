package NEETCODE.LINKED_LIST;

public class Cycle {
    static class NodeList{
        int data;
        NodeList next;
        NodeList(int new_data){
            data = new_data;
            next = null;
        }
    }
    public boolean copyRandomList(NodeList head) {
        NodeList slow = head;
        NodeList fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

package LinkedList;

public class MultiplyTwoNumbers {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;

        }
        public static long multiplyOf(Node first, Node second){
            long mod = 1000000007;
            long num1 = 0, nums2 = 0;
            while(first != null || second!= null){
                if(first != null){
                    num1 = ((num1*10)+ first.data)%mod;
                    first  = first.next;
                }
                if(second != null){
                    nums2 = ((nums2*10)+ second.data);
                    second = second.next;
                }
            }
            return (num1*nums2)%mod;
        }
        static void printList(Node curr) {
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }

        public static void main(String args[]) {

            // create first list 9->4->6
            Node head1 = new Node(1);
            head1.next = new Node(2);
            head1.next.next = new Node(3);

            // create second list 8->4
            Node head2 = new Node(1);
            head2.next = new Node(0);
            System.out.println(multiplyOf(head1, head2));
        }
    }
}

package Queue;

import javax.swing.*;
import java.util.Arrays;

public class Normal_Queue {
    public static class normal_Queu{
        int[] data;
        int size;
        int front;

        public normal_Queu(int n){
            data  = new int[n];
            size = 0;
            front = 0;
        }
        public boolean isFull(){
            return size == data.length-1;
        }
        public boolean isEmpty(){
            return size==-1;
        }
        void display(){
            for(int i = 0; i<size; i++){
                int idx = (front + i) %data.length;
                System.out.println(data[idx]);
            }
        }
        int size(){
            return size;
        }
        public void push(int x){
            if(size == data.length-1){
                System.out.println("Queue is full now.");;
            }else{
                int rear = front +size ;
                data[rear] = x;
                size++;
            }

        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is overflow.");
                return -1;
            }else {
                int val = data[front];
                front =(front +1) % data.length;
                size--;
                return val;
            }
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is underflow");
                return -1;
            }else {
                return data[front];

            }
        }
    }

    public static void main(String[] args) {
        normal_Queu queue = new normal_Queu(5);
        queue.push(33);
        queue.display();
    }

}

//https://www.geeksforgeeks.org/dsa/sort-numbers-stored-on-different-machines/
//iven n machines in the form of the Linked list. Each machine contains some numbers in sorted form. But the amount of numbers, each machine has is not fixed. Output the numbers from all the machine in sorted non-decreasing form.
//
//Examples:
//
//Input: Machine M1 : [30, 40, 50]
//           Machine M2 : [35, 45]
//          Machine M3 : [10, 60, 70, 80, 100]
//Output: [10, 30, 35, 40, 45, 50, 60, 70, 80, 100]
//Explanation: Sorted Number from all Machine is [10, 30, 35, 40, 45, 50, 60, 70, 80, 100]
//
//Input: Machine M1 : [1, 5 , 10]
//           Machine M2 : [35, 45]
//          Machine M3 : [30, 90, 130]
//Output: [1, 5, 10, 30, 35, 45, 90, 130]
//Explanation: Sorted Number from all Machine is [1, 5, 10, 30, 35, 45, 90, 130]
package Sorting;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class Merge_K_sortArray {

    static class Element {
        int value;
        int row;
        int column;
        Element(int value, int row, int column){
            this.value = value;
            this.row = row;
            this.column = column;
        }
    }
    public static ArrayList<Integer> mergesort (int[][] matrix, int k ){
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue< Element> minheap = new PriorityQueue<>(
                (a,b) ->Integer.compare(a.value,b.value)
        );
        //Put first element of each row into heap
        for(int i = 0; i<k; i++){
            if(matrix[i].length > 0)
                minheap.add(new Element(matrix[i][0], i, 0));
        }
        //Pop min push next from  the same row
        while(!minheap.isEmpty()){
            Element curr = minheap.poll();
            result.add(curr.value);
            int nextCol = curr.column+1;
            if(nextCol < matrix[curr.row].length){
                minheap.add(  new Element(matrix[curr.row][nextCol], curr.row, nextCol));
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {2, 6, 10},
                {3, 7, 11}
        };
        ArrayList<Integer> result =   mergesort(matrix, 3) ;
        System.out.println(result);


    }
}

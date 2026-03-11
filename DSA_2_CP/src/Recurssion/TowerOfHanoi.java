package Recurssion;

public class TowerOfHanoi {
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        //base case
        if(n==0){
            return 0;
        }

        int moves = towerOfHanoi(n-1, from, aux, to);
        moves++;

       moves+= towerOfHanoi(n-1,aux, to , from);
       return moves;

    }
    public static void main(String args[]){


        // A, B and C are names of rods
        System.out.println(towerOfHanoi(2, 'A','B', 'C'));

    }
}

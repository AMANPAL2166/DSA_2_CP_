package Daily_Question;
//Given an n x n binary grid, in one step you can choose two adjacent rows of the grid and swap them.
//
//A grid is said to be valid if all the cells above the main diagonal are zeros.
//
//Return the minimum number of steps needed to make the grid valid, or -1 if the grid cannot be valid.
//
//The main diagonal of a grid is the diagonal that starts at cell (1, 1) and ends at cell (n, n).

public class MINIMUM_SWAP {
    public static int minSwap(int[][] grid){
        int n = grid.length;
        int[] trailingZeroes = new int[n];
        //pre calculating trailing zeroes for each row
        for(int i = 0;i<grid.length;i++){
            int count = 0;
            for(int j = n-1;j>=0;j--){
                if(grid[i][j] ==0){
                    count++;
                }else{
                    break;
                }
            }
            trailingZeroes[i] = count;
        }
        int totalSwap = 0;
        //Greedy search for each row's requirement


        for(int i = 0;i<n;i++){
            int target = n-1-i;
            int foundIdx = -1;
            for(int j = i;j<n;j++){
                if(trailingZeroes[j]>=target){
                    foundIdx = j;
                    break;
                }
            } //If no valid score row found, return -1;
            if(foundIdx ==-1 ) return -1;
            //move the found row to the current position 'i'
            //this mimics the adjacent, swap
            for(int k = foundIdx;k>i;k--){
                int temp = trailingZeroes[k];
                trailingZeroes[k] = trailingZeroes[k-1];
                trailingZeroes[k-1] = temp;
                totalSwap++;
            }

        }
        return totalSwap;

    }

}

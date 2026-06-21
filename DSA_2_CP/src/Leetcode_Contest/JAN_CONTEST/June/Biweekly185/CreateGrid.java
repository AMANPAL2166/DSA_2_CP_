package Leetcode_Contest.JAN_CONTEST.June.Biweekly185;

public class CreateGrid {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        //Step: Initialize whole the grid with obstacle"#";
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++) {
                grid[i][j] = '#';
            }
        }
       // Step 2: Open up the first row
        for(int j = 0;j<n;j++){
            grid[0][j] = '.';

        }
        //Step 3: Open up the last column
        for(int i = 0;i<m;i++){
            grid[i][n-1] = '.';
        }
        //Convert char array to the required String output
        String[] result = new String[m];
        for(int i = 0;i<m;i++){
            result[i] = new String(grid[i]);
        }
        return result;

    }
}

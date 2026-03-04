package Daily_Question;

import java.util.Arrays;

public class specialMatrix {
    public static int  numSpecial(int[][] mat){
         int m = mat.length;
         int n = mat[0].length;
         int[] rowCount = new int[m];
         int[] colColunt = new int[n];
         //step 1: Har row aur column mein 1's ka count nikalna
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] ==1){
                    rowCount[i]++;
                    colColunt[j]++;
                }
            }
        }
        int specialPosition = 0;
        //Step 2:Special positions check
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j]==1 && rowCount[i] ==1 && colColunt[j]==1){
                    specialPosition++;

                }
            }
        }
        return specialPosition;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,0,0}, // Row 0
                {0,0,1}, // Row 1
                {1,0,0} // Row 2
        };
        System.out.println(numSpecial(mat));
    }


}

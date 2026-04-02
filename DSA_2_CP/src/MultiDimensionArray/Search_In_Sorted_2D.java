package MultiDimensionArray;

public class Search_In_Sorted_2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j= n-1;
        while(i<=m && j>=0){//time complex would be """""""""""(M+N)"""""""""""
            if(matrix[i][j] > target) j--;
            else if(matrix[i][j] < target) i++;
            else return true;
        }
        return  false;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15}, {2,5,8,12,19}};
        System.out.println(searchMatrix(arr,19));
    }
}

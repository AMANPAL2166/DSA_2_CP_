package Array;

public class Search_in2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 9;

        Search_in2D obj = new Search_in2D();
        System.out.println(obj.searchMatrix2(arr,target));

    }
    public boolean searchMatrix1(int[][] matrix, int target){
        for(int i = 0; i< matrix.length; i++){
            for(int  j = 0; j< matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;

                }
            }
        }
        return false;
    }
    public boolean searchMatrix2(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int st = 0, end = row*col-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int midele = matrix[mid/col][mid%col]; //Mapping
            if(midele == target){
                return true;
            }else if(midele<target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}

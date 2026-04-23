package NEETCODE.MATH_and_GROMETRY;

public class setMatrixZero {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        //1. Check if first row or first column
        for(int i = 0;i<row;i++){
            if(matrix[i][0] == 0) firstColZero = true;
        }
        for(int j= 0;j<cols; j++){
            if(matrix[0][j] == 0) firstRowZero = true;
        }
        //2. Use first row and column as markers
        for(int i = 1;i<row;i++){
            for(int j = 1;j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //3. Zero out cells based on markers
        for(int i = 1;i<row; i++){
            for(int j= 1;j<cols;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //4. Finally, zero out the first row and col if needeed
        if(firstColZero){
            for(int i = 0;i<row;i++) matrix[i][0] = 0;
        }
        if(firstRowZero){
            for(int j = 0;j<cols;j++){
                matrix[0][j] = 0;
            }
        }
    }

}

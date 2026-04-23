package NEETCODE.MATH_and_GROMETRY;

public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++) {
            for(int j = 0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row
        for(int i = 0;i<matrix.length;i++){
            int st = 0, end = matrix[0].length-1;
            while(st<end){
                //swap the element
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;
                st++;
                end--;
            }

        }
    }

    public static void main(String[] args) {
        int[][] mat  = {{1,2,3}, {4, 5, 6}, {7,8,9}};
        rotate(mat);
        for(int[] row: mat){
            for(int val : row){
                System.out.print (val + " ");
            }
            System.out.println();
        }

    }
}

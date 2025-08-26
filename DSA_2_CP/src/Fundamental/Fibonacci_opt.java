package Fundamental;

public class Fibonacci_opt {
    //Using Matrix Exponentiation - O(log(n)) time and O(log(n)) space
    public static void multiply(int[][] mat1, int[][] mat2) {
        //Performance matrix multiplication
        int x =mat1[0][0]*mat2[0][0] + mat1[0][1]*mat2[1][0];
        int y =mat1[0][0]*mat2[0][1] + mat1[0][1]*mat2[1][1];
        int z =mat1[1][0]*mat2[0][0] + mat1[1][1]*mat2[1][0];
        int w = mat1[1][0]*mat2[0][1] + mat1[1][1]*mat2[1][1];
        //Update matrix with the result
        mat1[0][0]= x;
        mat1[0][1] = y;
        mat1[1][0] = z;
        mat1[1][1] = w;
    }
    //Function to perform matrix exponentiation
    static void matrixPower(int[][] mat1, int n ) {
        //Base case for recursion
        if(n==0 || n ==1){ return ;}
        //Initial the helper matrix
        int[][] mat2 = {{1,1}, {1,0}};
        //Recursuily calculate mat1^(n/2);
        matrixPower(mat1, n/2);
        //Square the matrix mat1
        multiply(mat1,mat1);
        //If n is odd multiplying with the helper matrix mat2
        if(n%2 != 0 ){
            multiply(mat1, mat2);
        }

    }
    //Function to calculate nth fibonacci
    static int nthfibonacci(int n ) {
        if(n<=1){ return n;}
        //Initialize the  transformation matrix
        int[][]  mat1 = {{1,1} , {1,0}};
        //Raise the matrix mat1 to the power of (n-1)
        matrixPower(mat1,n-1);
        //The result is the top left cell of the matrix
        return mat1[0][0];

    }

    public static void main(String[] args) {
        int n = 22;
        int result = nthfibonacci(n);
        System.out.println(result);
    }

}
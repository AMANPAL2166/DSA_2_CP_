package MultiDimensionArray;

public class ReverseMatrix {
    public static void main(String[] args) {
        int[][] arr = {{ 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
        /// traverse each row of arr[][]
        for(int i = 0;i<arr.length;i++){
            int st = 0, end = arr[0].length-1;
            while(st<end){
                //swap the element
                int temp=  arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st++;
                end--;
            }

        }
        int M = arr.length;
        int N = arr[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

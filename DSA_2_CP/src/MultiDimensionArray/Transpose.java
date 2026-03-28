package MultiDimensionArray;

public class Transpose {
    public static void main(int[][] arr) {
        print(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                int  temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        print(arr);

    }

    public static void print(int[][] arr) {
        for(int[] a: arr){
            for(int ele:a){
                System.out.print( ele+" ");
            }
            System.out.println();
        }

    }
}

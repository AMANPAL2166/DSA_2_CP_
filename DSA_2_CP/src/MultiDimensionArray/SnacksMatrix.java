package MultiDimensionArray;

public class SnacksMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5}, {4,5,6,1}, {1,3,2,5}, {1,5,3,7}};
        ///  this is for row-wise snack printing
        for(int i = 0;i<arr.length;i++){
            if(i%2 != 0){
                for(int j = arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }else {
                for(int j = 0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }



        }
        System.out.println();
        System.out.println();
        System.out.println();
        /// this is columns-wise snack printing
        for(int i = 0;i<arr[0].length;i++){
            if(i%2 != 0){
                for(int j = arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }else {
                for(int j = 0;j<arr.length;j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }


        }
    }
}

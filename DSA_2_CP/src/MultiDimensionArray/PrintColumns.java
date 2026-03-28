package MultiDimensionArray;

public class PrintColumns {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5}, {4,5,6,1}, {1,3,2,5}, {1,5,3,7}};
//        for(int i = 0;i<arr[0].length;i++){
//            System.out.print(arr[i][0]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr[0].length;i++){
//            System.out.print(arr[i][1]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr[0].length;i++){
//            System.out.print(arr[i][2]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr[0].length;i++){
//            System.out.print(arr[i][3]+" ");
//        }
//        System.out.println();

//        for(int i = 0;i<1;i++){///  this will give exception out of bound, if our matrix wasn't square
//            for(int j = 0;j<arr[0].length;j++){
//                System.out.print(arr[j][i]+" ");
//            }
//        }
//        for(int i = 0;i<arr[0].length;i++){///  this is perfectly fine👍🏻
//            for(int j = 0;j<arr.length;j++){
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }
        /// do the same things using for-each loop
        for(int[] a : arr){
            for(int ele : a){
                System.out.print (ele +" ");
            }
            System.out.println();
        }

    }

}

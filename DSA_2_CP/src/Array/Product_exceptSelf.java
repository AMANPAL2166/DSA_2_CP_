 // https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

package Array;

 import java.util.Arrays;

 public class Product_exceptSelf {
    //Brute force code using (N^2) time and space complexity
    //suppose we have array [2.3.5.6.7]: we need to find arr[1] = 2*5*6*7 = [_, 420, _ , _ , _]
    public static int[]  productexceptself(int arr[]){
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        //Use for loop to get first arr
        for(int i = 0; i<n ; i++){
            //Creat new loop for product of rest of element in array except self
            for(int j = 1; j<n; i++){
                if( i != j) {
                    result[i] *= arr[j];
                }
            }

        }
        return result ;


    }

}

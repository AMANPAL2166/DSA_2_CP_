package Array;

public class Basics {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 33;
        arr[1] = 34;
        arr[2] = 54;
        arr[3] = 30;
        arr[4] = 00;
        swap(arr, 0, 4);
//        int[] new_arr = arr;//At this movement, I try to understand memory storage.
//        new_arr[4] = 99;
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    //This function use for swap two number in array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

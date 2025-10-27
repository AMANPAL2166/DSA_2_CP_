package Array;

public class Span {
    public static void span(int[] arr) {
         int max = Integer.MIN_VALUE;
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if(min>arr[i]) {
                arr[i] = min;
            }
         }
        System.out.println("Max digit in the element: " + max);
        System.out.println("MIN digit in the element: "+ min);
        int span = max-min;
        System.out.println("Span of a number is: " + span);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        span(arr);
        find_ele(arr, 20);
    }

    public static void find_ele(int[] arr, int d) {
        int idx = -1;
        for(int i =0; i< arr.length; i++){
            if(arr[i]==d){
                idx = i;
                break;
            }

        }
        System.out.println("Index of this element: "+idx);

    }
}

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
        int[] arr = {3, 4, 0, 5, 2};
        span(arr);
        find_ele(arr, 20);
        barplot(arr);
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

    public static void barplot(int[] s) {
        int max = s[0];
        for(int i = 1; i<s.length; i++){
            if(s[i]>max){
                  max=s[i];
            }
        }
        for(int i=max; i>=1; i--){
            for(int j =0; j<s.length;j++){
                if(s[j]>= i){
                    System.out.print ("*\t");
                }else {
                    System.out.print ("\t");
                }
            }
            System.out.println();

        }
    }
}

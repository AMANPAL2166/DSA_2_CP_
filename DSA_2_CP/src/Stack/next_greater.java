package Stack;

public class next_greater {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        for(int i =0; i<arr.length;i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]>arr[i]) {
                    System.out.println("Next greater for " + arr[i] + " is " + arr[j]);
                    i++;

                }
            }
            System.out.println("Next greater for " + arr[i] + " is " + -1);
        }
    }
}

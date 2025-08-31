package Fundamental;

public class find_dublicate {
    public static void main(String[] args) {
        int[] arr = {3,5,2,5,9,6,5};
        System.out.println(dublicates(arr));
    }

    public static   boolean dublicates(int[] arr) {
        int n = arr.length;
        boolean[] flag = new boolean[n+1];
        for(int i = 0; i<n; i++){
            int element = arr[i];
            if(flag[element]){
                return true;
            }else{
               flag[element]= true;
            }
        }
        return false;
    }
}

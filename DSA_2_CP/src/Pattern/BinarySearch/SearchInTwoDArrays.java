package Pattern.BinarySearch;

public class SearchInTwoDArrays {
    public static int   twoDSearch(int[][] nums, int tar) {
        for(int i = 0;i<nums.length;i++){
            for(int j= 0;j<nums[i].length;j++){
                System.out.println("["+i+"]" + "["+j+"]" + "= " +nums[i][j] );
                if(nums[i][j] == tar){
                    return j;
                }
            }
        }
        System.out.println("Nums length: "+nums.length);
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3}, {4, 5, 6,8}, {7, 8, 9}
        };
        twoDSearch(arr,4);



    }

}

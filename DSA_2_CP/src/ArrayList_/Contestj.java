package ArrayList_;

import java.util.ArrayList;

public class Contestj {
    public static int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length  ;i++){
            int count = 1;
            ans.add(nums[i]);
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    i = j-1;
                    break;
                }
                if(nums[i] == nums[j] && count<k){
                    ans.add(nums[j]);
                    count++;
                }
            }

        }
        int[] ansInt = new int[ans.size()];
        for(int i = 0 ;i<ansInt.length;i++){
            ansInt[i] = ans.get(i);
        }
        return ansInt;

    }
    public static int[] limitOccurrences_2(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<nums.length  ;i++){
            //reassign count as 1 if there are found same number, otherwise increment count
            if(i> 0 && nums[i] == nums[i-1]){
                count++;
            }else{
                count=1;
            }
            //only add if haven't reached the limit
            if(count <= k){
                ans.add(nums[i]);
            }


        }
        int[] ansInt = new int[ans.size()];
        for(int i = 0 ;i<ans.size();i++){
            ansInt[i] = ans.get(i);
        }
        return ansInt;

    }


    public static void main(String[] args) {
        int[] arr= {5,5};
        int[] ans = limitOccurrences(arr,1);
        for( int i : ans){
            System.out.print(ans[i] + " ");
        }

    }
}

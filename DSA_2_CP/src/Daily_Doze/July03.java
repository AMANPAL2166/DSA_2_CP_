package Daily_Doze;

import java.util.ArrayList;
import java.util.List;

public class July03 {
    public static List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        for(int num = 1;num<=n;num++){
            //edge case
            if(i>= target.length) break;
            if(num == target[i]){
                ans.add("Push");
                i++;
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;

    }
    //subsets problem, using recursion
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset= new ArrayList<>();
        //Helper function ko call karege, start form 0 index
        helper(nums, 0, currentSubset, result);
        return result;

    }

    private static void helper(int[] nums, int index,   List<Integer> currenEle,List<List<Integer>> result) {
        //base condition
        if(index == nums.length) {
            //create a new copy of currele and append it to result list
            result.add(new ArrayList<>(currenEle));
            return;
        }
        //choice 1: Element ko nhi lena hai
        helper(nums, index+1, currenEle, result);
        currenEle.add(nums[index]);
        //choice 2: Element ko lena hai
        helper(nums, index+1, currenEle, result);
        //Backtracking step: agli branch ke liye state ko wapas phele jaisa karna
        currenEle.remove(currenEle.size()-1);

    }

    public static void main(String[] args) {
        int[] target = {1, 3};
        int n = 3;
        System.out.println(buildArray(target,n));
    }
}

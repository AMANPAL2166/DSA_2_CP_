package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        newHelper(k,n,1,new ArrayList<>(),ans);
        return ans;
    }

    private static void newHelper(int k, int remainingTarget ,int start,List<Integer>currentCom, List<List<Integer>> ans) {
            //base condition
        if(remainingTarget == 0 && k == 0){
                ans.add(new ArrayList<>(currentCom));
                return;
            }
            //if k go out of number
        if(k==0 && remainingTarget<0) return;
            for(int i = start;i<=9;i++){
                currentCom.add(i);
                newHelper(k-1,remainingTarget-i, i+1,currentCom,ans);
                currentCom.remove(currentCom.size()-1);
            }



    }

    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum3(3,9);
        for(List<Integer> st : ans){
            System.out.println(st);
        }

    }

}

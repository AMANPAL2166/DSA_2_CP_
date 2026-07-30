package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        partitionFunctio(s,ans,new ArrayList<>(), 0);
        return ans;

    }

    private void partitionFunctio(String s, List<List<String>> ans, List<String> currCom, int index) {
        //base case
        if(index == s.length()){
            ans.add(new ArrayList<>(currCom));
            return;
        }
        for(int end = index;end<s.length();end++){
            String part = s.substring(index, end+1);
            if(isPalindrom(part)){
                currCom.add(part);
                partitionFunctio(s, ans, currCom, end+1);
                currCom.remove(currCom.size()-1);
            }
        }
    }

    private boolean isPalindrom(String part) {
        int start = 0;
        int end = part.length()-1;
        while (start<end){
            if(part.charAt(start) != part.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}

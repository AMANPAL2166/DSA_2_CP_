package String;

import java.util.ArrayList;
import java.util.Arrays;

//Given a list of words, S followed by two specific words, word1 and word2, the task is to find the minimum distance between the indices of these two words in the list.
//
//Note: word1 and word2 are both in the list, and there can be multiple occurrences of words in the list.
//
//Example :
//
//Input:S = { "the", "quick", "brown", "fox", "quick"}
//word1 = "the"
//word2 = "fox"
//Output: 3
//Explanation: Minimum distance between the words "the" and "fox" is 3
//https://www.geeksforgeeks.org/problems/closest-strings0611/1
public class SortestDistance {
    static int Sortdistancess(ArrayList<String> s, String word1, String word2){
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1)) {
                d1 = i;
            }
            if (s.get(i).equals(word2)) {
                d2 = i;
            }
            if (d1 != -1 && d2 != -1) {
                ans = Math.min(ans, Math.abs(d1 - d2));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> S = new ArrayList<>(Arrays.asList("ffk", "tj" ,"mbq" , "bq"));
        String word1 = "tj", word2 = "mbq";
        System.out.println(Sortdistancess(S, word1, word2));
    }
}

package String;
//Input: s = "geeksforgeeks"
//Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
//Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.

import java.util.Arrays;

public class Print_All_duplicate_In_str {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        //convert into arrays
        char[] ch = s.toCharArray();
         //sort ch
        Arrays.sort(ch);
        for(int i = 0; i<ch.length; ){
            int count = 1;
            while(i+count <ch.length && ch[i] == ch[i+count]){
                count++;
            }
            if(count>1){
                System.out.print ("[" + ch[i] + "," + count + "],");
            }
            //move to the next different i
            i +=count;
        }

    }

}

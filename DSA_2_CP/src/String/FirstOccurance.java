package String;

public class FirstOccurance {
     public  static int firstOccurence(String txt, String pat) {
        // code here
         int n = txt.length();
         int m = pat.length();

         // Iterate through txt
         for (int i = 0; i <= n - m; i++) {

             // Check for substring match
             int j;
             for (j = 0; j < m; j++) {

                 // Mismatch found
                 if (txt.charAt(i + j) != pat.charAt(j)) {
                     break;
                 }
             }

             // If we completed the inner loop, we found a match
             if (j == m) {

                 // Return starting index
                 return i;
             }
         }

         // No match found
         return -1;

    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";
        System.out.println(firstOccurence(txt, pat));

    }
}

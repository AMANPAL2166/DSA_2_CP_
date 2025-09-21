package String;

import java.util.ArrayList;
import java.util.List;

public class Camel_match {
    public static void main(String[] args) {

    }
    public List<Boolean> camelMathc (String[] queries,String pattern){
        List<Boolean> result = new ArrayList<>();
        for (String q : queries) {
            result.add(isMatch(q, pattern));
        }
        return result;
    }

    private boolean isMatch(String query, String pattern) {
        int i = 0, j = 0; // i for query, j for pattern
        while (i < query.length()) {
            char qc = query.charAt(i);

            if (j < pattern.length() && qc == pattern.charAt(j)) {
                // match char in both
                i++;
                j++;
            } else {
                if (Character.isUpperCase(qc)) {
                    // extra uppercase → not allowed
                    return false;
                }
                i++; // skip lowercase
            }
        }
        return j == pattern.length(); // pattern fully matched
    }
}

package Daily_Question;

import java.util.Arrays;

public class findSmallest_GreaterthanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        for(int i= 0;i<letters.length; i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return  letters[0];

    }
    //We can also solve using binary search approach::::

    public static void main(String[] args) {
        char[] s = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(s, target));
    };

}

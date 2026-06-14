package ArrayList_;

import java.lang.reflect.Array;
import java.util.HashSet;

public class PasswordStrength {
    public static HashSet<Character> passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        char[] charArray = password.toCharArray();
        for(int i = 0;i<charArray.length;i++){
            set.add(charArray[i] );
        }
        int sum = 0;
        for (char ch : set) { // यह लूप सेट के हर कैरेक्टर को एक-एक करके 'ch' में लाएगा
            if (ch >= 'A' && ch <= 'Z') {
                sum += 2;
            }
            else if (ch >= 'a' && ch <= 'z') {
                sum += 1;
            }
            else if (ch >= '0' && ch <= '9') {
                sum += 3;
            }
            else {
                sum += 5;
            }
        }
        return set;

    }
    public static int passwordStrength_(String password) {
        boolean hasUpeer = false;
        boolean haslower = false;
        boolean hasDigit  = false;
        boolean hasSpecial=false;
        for (char ch : password.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                hasUpeer = true;
            }
            else if (ch >= 'a' && ch <= 'z') {
                haslower = true;
            }
            else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
            else {
                hasSpecial = true;
            }
        }
        int score = 0;
        if(hasUpeer) score += 2;
        if(haslower) score += 1;
        if(hasDigit) score += 3;
        if(hasSpecial) score += 5;
        return score;

    }


    public static void main(String[] args) {
        String st = "Aab45!";
//       HashSet<Character> set = passwordStrength(st);
//       for(char ch: set){
//           System.out.println(ch);
//       }
        System.out.println(passwordStrength_(st));
    }

}

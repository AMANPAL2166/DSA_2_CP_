package String;

public class Check_Parentheses {
    public static void main(String[] args) {
        String r = "([)]";
        System.out.println(isValid(r));

    }
    //In this method we can't handle nesting and order, which are the core of the Valid Parentheses problem
    public static boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                // Code to execute if any of the conditions are true
                for(int j =0; j<s.length(); j++){
                    if(s.charAt(j) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                        return true;
                    }
                }
            }
        }
        return false;

    }
}

package String;

import java.util.Stack;

public class Check_Parentheses {
    public static void main(String[] args) {
        String r = "([)]";
        System.out.println(isValid_1(r));

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

    public static boolean isValid_1(String s) {
        // Create a new stack to store the characters
        Stack<Character> stack = new Stack<>();
        //convert string into char array and access the character using for loop.
        for(char ch: s.toCharArray())
        {
            // check ch
            switch (ch)
            {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                    // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.

        return stack.isEmpty();

    }
}

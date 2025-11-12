package Stack;

import java.util.Stack;

public class infinix_conversion {
    public static void main(String[] args) {
        String exp = "a*(b-c)/d+e ";
        //code
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                ops.push(ch);
            } else if (
                    (ch >= '0' && ch <= '9') ||
                            (ch >= 'a' && ch <= 'z') ||
                            (ch >= 'A' && ch <= 'Z')

            ) {
                postfix.push(ch + " ");
                prefix.push(ch + " ");

            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(ops, postfix, prefix);

                }
                ops.pop();//poping the opening bracket
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    process(ops, postfix, prefix);

                }
                ops.push(ch);//pushing current operator
            }
            while (ops.size() > 0  ) {
                process(ops, postfix, prefix);

            }
            System.out.println(postfix.pop());
            System.out.println(prefix.pop());
        }


    }

    public static void process(Stack<Character> ops, Stack<String> postfix, Stack<String> prefix) {
        char op = ops.pop();
        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push(postv);


        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String prev = prev1 + prev2 + op;
        postfix.push(prev);


    }

    public static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }

    }
}

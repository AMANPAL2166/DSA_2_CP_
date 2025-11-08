package Stack;

import java.util.Stack;

public class Infix_evalution {
    public static void main(String[] args) {
        String exp = "2+(5-3*6/2)";
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i = 0; i<exp.length(); i++){
            char ch  = exp.charAt(i);
            if(ch=='('){
                operators.push(ch );
                
            } else if (Character.isDigit(ch)) {
                operand.push(ch-'0');
                
            } else if (ch==')') {
                while(operators.peek() != '('){
                    char op = operators.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int opv = operation(v1, v2,op);
                    operand.push(opv);

                }
                operators.pop();
            } else if (ch=='+' || ch=='-'  ||ch=='*'|| ch=='/' ) {
                //ch is wanting higher priority operators to solve first
                while(operators.size()>0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    char op = operators.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int opv = operation(v1, v2,op);
                    operand.push(opv);
                }
            }
            // ch is pushing itself now
            operators.push(ch);
        }
        while(operators.peek() != 0){
            char op = operators.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();

            int opv = operation(v1, v2,op);
            operand.push(opv);

        }
        System.out.println(operand.peek());
    }

    public static int precedence(char  operators) {
        if(operators == '+'){
            return 1;
        } else if (operators == '-') {
            return 1;
        } else if (operators== '*') {
            return 2;
        }else{
            return 2;
        }

    }

    public static int   operation(int v1, int v2, char operators) {
        if(operators == '+'){
            return v1+v2;
        } else if (operators == '-') {
            return v1-v2;
        } else if (operators== '*') {
            return v1*v2;
        }else{
            return v1/v2;
        }

    }
}

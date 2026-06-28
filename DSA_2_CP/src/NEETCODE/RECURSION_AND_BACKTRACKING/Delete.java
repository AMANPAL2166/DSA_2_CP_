package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.Stack;

public class Delete {
    private static void deletMiddleElement(Stack<Integer> st, int k){
        //Base case
        if(k==1){
            st.pop();
            return;
        }
        //Hypothesis
        int temp = st.pop();
        deletMiddleElement(st, k-1);
        //Induction
        st.push(temp);

    }
    private static void deleteLastElement(Stack<Integer> st, int k){
        //base case
        if(k == 1){
            st.pop();
            return;
        }
        //Hypothesis
        int temp = st.pop();
        deleteLastElement(st, k-1);
        //Induction
        st.push(temp);
    }
    public int myAtoi(String s) {
        int n = s.length();
        int num = 0;
        int i = 0;
        int sign = 1;
        //skip spaces
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        //handle sign
        if(i<n){
            if(s.charAt(i) == '-'){
                sign = -1;
                i++;
            }else if(s.charAt(i) == '+'){
                sign = 1;
                i++;
            }
        }

        while( i< n && s.charAt(i) >='0' && s.charAt(i) <='9'){
            int digit= s.charAt(i)- '0';
            //overflow check
            if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE /10 && digit > 7)){
                return (sign == 1) ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            num = num*10+digit;
            i++;
        }
        return num*sign;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(2);
        int lastEle = st.size();
        int k = ((st.size()/2)+1);
       // deletMiddleElement(st,k);
        deleteLastElement(st, lastEle);
        System.out.println(st);
    }
}

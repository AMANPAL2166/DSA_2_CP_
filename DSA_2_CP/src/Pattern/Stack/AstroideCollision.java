package Pattern.Stack;

import java.util.Stack;

public class AstroideCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast: asteroids){
            boolean destroyed = false;
            while(!st.isEmpty() && ast <0 && st.peek()>0){
                if(Math.abs(st.peek())<Math.abs(ast)) {
                    st.pop();//top explode
                    continue;

                }else if(Math.abs(st.peek()) == Math.abs(ast)){
                    st.pop(); // both explode
                }
                destroyed= true;
                break;
            }
            if(!destroyed){
                st.push(ast);
            }
        }
        //convert stact to array
        int[] ans = new int[st.size()];
        for(int i  = st.size()-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;

    }
}

package Daily_Doze;

import java.util.Stack;

public class June29 {
    public static String longestCommonPrefix(String[] strs) {
        //edge case
        if(strs.length == 0) return "";
        String first = strs[0];
        for(int i = 0;i<first.length();i++){
            char ch = first.charAt(i);
            for(int j = 1;j<strs.length;j++){
                if(i >= strs[j].length()){
                    return first.substring(0,i);
                }
                if(ch != strs[j].charAt(i)){
                    return first.substring(0, i);

                }
            }
        }
        return first;

    }
    public static int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder sb=new StringBuilder();
        while( sb.length() < b.length()  ){
            sb.append(a);
            count++;

        }
        if(sb.toString().contains(b)){
            return count;//if found return hear, otherwise do exactly one more time
        }
        sb.append(a);
        count++;
        if(sb.toString().contains(b)){
            return count;
        }
        return -1;

    }
    private static void reversStack(Stack<Integer> st ){
        //base case
        if(st.size() == 1 ) return;
        //Hypothesis
        ///  Store top element in temp. so that we can access later
        int temp  = st.peek();
        st.pop();
       reversStack(st );
        //Induction
        insert(st, temp);
    }
    private static void insert(Stack<Integer> st , int temp){
        if(st.size() == 0){
            st.push(temp);
            return;
        }
        //Hypothesis
        int x = st.peek();
        st.pop();
        insert(st, temp);
        st.push(x);
    }

    public static void main(String[] args) {
//        String[] str = {"dog","racecar","car"};
//        System.out.println(longestCommonPrefix(str));
//        String a = "abc", b = "cabca";
//        System.out.println(repeatedStringMatch(a,b));
          Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack"+st);
        reversStack(st);
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println();
    }
}

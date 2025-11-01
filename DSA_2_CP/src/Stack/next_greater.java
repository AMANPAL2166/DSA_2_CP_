package Stack;

import java.util.Stack;


public class next_greater {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] nget = solve(arr);
        display(nget);
    }

    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int val: arr){
            sb.append(val + "\n");

        }
        System.out.println(sb);

    }

    private static int[] solve(int[] arr) {
        int[] nget = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nget[arr.length-1] = -1;
        for(int i =arr.length-2; i>=0;i--){
            //-a+
            while(st.size()>0 && arr[i] >st.peek()){
                st.pop();
            }
            if(st.size() == 0 ){
                nget[i] = -1;

            }else{
                nget[i] = st.peek();

            }
            st.push(arr[i]);

        }
        return nget;
    }
}

package Stack;

import java.util.Stack;

public class next_greater_2 {
    public static void main(String[] args) {
        int[] arr =  {3,4,2,6,7,3,7,3,8};
        for(int i = 0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] negt = solve(arr);
        display(negt);
    }

    public static void display(int[] arr) {
        StringBuilder sb  = new StringBuilder();
        for(int i = 0; i< arr.length; i++) {
            sb.append(arr[i]+ "\n");
        }
        System.out.println(sb);
    }

    public static int[] solve(int[] arr) {
        int[] nget = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i = 0; i< arr.length; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                nget[pos] = arr[i];
                st.pop();
            }
            st.push(i);

        }
        while(st.size()>0){
            int pos = st.peek();
            nget[pos] = -1;
            st.pop();
        }
        return nget;
    }
}

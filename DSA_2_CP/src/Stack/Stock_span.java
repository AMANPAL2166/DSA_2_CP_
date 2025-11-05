package Stack;


import java.util.Stack;

public class Stock_span {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int[] nget = solve(arr);
        display(nget);
    }
    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int val: arr){
            sb.append(val+ "\n");
        }
        System.out.println(sb);
    }

    public static int[] solve(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] count = new int[arr.length];
        count[0] = 1;
        for(int i = 1; i<arr.length; i++){
            while(st.size()>0 && arr[i ]>arr[st.peek()] ){
                st.pop();
            }
            if(st.size()==0){
                count[i] = i+1;
            }else{
                count[i] = i - st.peek();
            }
            st.push(i);
        }
        return count;
    }
}

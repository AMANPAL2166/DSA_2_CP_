package Stack;

import java.util.Stack;

public class celebrity_Problem {
    static int[][] knowmatrix;
    public static void main(String[] args) {
        int n = 4;
        knowmatrix = new int[][]{
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 1, 0}
        };
//        int celeb = findcelebrity_2(knowmatrix);
        findcelebrity_2(knowmatrix);

//        if(celeb == -1){
//            System.out.println("No celebrity found");
//        }else {
//            System.out.println("Celebrity is person " + celeb);
//        }

    }
//This is a bruteforce method
    public static int findcelebrity(int n) {
        for(int i = 0; i<n; i++){
            boolean isCelebrity = true;
            for(int j= 0; j<n; j++){
                if(i!=j){
                    //check directly if i know j or j know i via knowmatrix
                    if(knowmatrix[i][j] ==1 || knowmatrix[j][i]==0) {
                        isCelebrity = false;
                        break;
                    }
                }
            }
            if(isCelebrity ) return i;
        }
        return -1;


    }

    public static int findcelebrity_1(int n) {
        //find the candidate
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (knowmatrix[candidate][i] == 1) {
                // candidate knows i, so candidate can't be celebrity
                candidate = i;
            }
            // else candidate does not know i; keep candidate as it is
        }

        // Step 2: Verify the candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // if candidate knows i OR i doesn't know candidate
                if (knowmatrix[candidate][i] == 1 || knowmatrix[i][candidate] == 0) {
                    return -1; // Not a celebrity
                }
            }
        }
        return candidate; // Candidate is celebrity
    }

    public static void findcelebrity_2(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            st.push(i);
        }
        while(st.size()>2){
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j] ==1){
                /// if i knows ->j : then i is not a celebrity
                st.push(j);
            }else {
                /// if  j knows -> i : then j is not a celebrity;
              st.push(i);
            }
        }
        int pot = st.pop();
        for(int i = 0; i<arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println(pot);

    }
}

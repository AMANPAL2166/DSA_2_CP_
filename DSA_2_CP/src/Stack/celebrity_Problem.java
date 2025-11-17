package Stack;

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
        int celeb = findcelebrity_1(n);
        if(celeb == -1){
            System.out.println("No celebrity found");
        }else {
            System.out.println("Celebrity is person " + celeb);
        }

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
}

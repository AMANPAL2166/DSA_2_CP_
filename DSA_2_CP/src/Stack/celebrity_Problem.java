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
        int celeb = findcelebrity(n);
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
}

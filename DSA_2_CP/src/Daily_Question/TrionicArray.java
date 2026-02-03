package Daily_Question;

public class TrionicArray {
    public static boolean isTrionic(int[] nums) {
        if(nums.length< 3){
            return false;
        }
        int state = 0;
        //0->increasing
        //1->decreasing
        //2->again increasing
        for(int i = 1; i<nums.length;i++){
            if(nums[i] == nums[i-1]){//Strict condition
                return false;

            }
            if(nums[i]>nums[i-1]){//increasing
                if(state == 1){
                    state = 2;//valley found
                }
            } else if (state == 2) {
                //continious increasing
            }//state 0 ->normal increasing
            else{//nums[i] <nums[i-1]-->decreasing;
                if(state ==0){
                    state  = 1;//peak found
                } else if (state == 2) {
                    return false;//can't decrease again
                }
                //state 1->continue decreasing

            }

        }//valid only if reached final increasing phase
        return state == 2;




    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,5,6};
        System.out.println(isTrionic(arr));
    }
}

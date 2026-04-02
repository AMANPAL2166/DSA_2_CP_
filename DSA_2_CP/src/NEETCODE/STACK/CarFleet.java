package NEETCODE.STACK;

public class CarFleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[] time = new double[n];
        for(int i = 0;i<n;i++){
            time[i] = (double)(target-position[i] )/speed[i];
        }
        int fleet = 0;
        for(int i = 0;i<n;i++){
            boolean isFleet = true;
            for(int j = i+1;j<n;j++){
                if(position[j] > position[i] && time[j]<+time[i]){
                    isFleet = false;//merge ho gya
                    break;
                }
            }
            if(isFleet) {
                fleet++;
            }
        }
        return  fleet;
    }

    public static void main(String[] args) {
        int[ ] position= {10,8,0,5,3}, speed = {2,4,1,1,3};
        System.out.println(carFleet(12,position,speed));

    }
}

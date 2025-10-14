package Fundamental;

public class rotate_number {
    public static void main(String[] args) {
        int n = 12739;
        int k =   3;
        int temp = n;
        int node = 0;
        while(temp>0){
            temp = temp /10;
            node++;
        }
        k = k%node;
        if(k<0){
            k = k + node;
        }
        int div = 1;
        int mul = 1;
        for(int i = 1; i<=node; i++){
            if(i<=k){
                div = div*10;
            }else{
                mul =mul*10;
            }
        }
        int q = n/div;
        int remiander = n%div;
        int rot = remiander*mul + q;
        System.out.println(rot);
    }
}

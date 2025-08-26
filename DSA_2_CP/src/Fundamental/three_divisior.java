package Fundamental;

import java.util.ArrayList;
import java.util.Arrays;

public class three_divisior {
    //Naive approach
    static int countdivision(int n ){
        int count = 1;
        for(int i =2; i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }

    static void numer_divisior(int n) {
        for(int i = 0; i<=n; i++){
            if(countdivision(i) == 3){
                System.out.println(i+"");
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Long> queries = new ArrayList<>();
        queries.add(10L);
        queries.add(30L);

        ArrayList<Integer> res = threedivisior(queries, queries.size());
        System.out.println(res); // Output: [2, 3]  (numbers with 3 divisors <=10 are 4,9; <=30 are 4,9,25)
    }

    //Now gonna solve Mathematical and expected approach::___
    static ArrayList<Integer>threedivisior(ArrayList<Long>query,int q){
        ArrayList<Integer> ans = new ArrayList<>();
        //Step first find the max queries
        long maxLimit = 0;
        for(long value: query){
            maxLimit = Math.max(maxLimit, value);
        }
        //Generate primes upto sqrt(maxLimit)
        int limit = (int) Math.sqrt(maxLimit);
        boolean[] prime = new boolean[limit+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i =2; i*i<= limit; i++){
            if(prime[i]){
                for(int j = i*i; j<=limit; j+= i){
                    prime[j] = false;
                }
            }
        }
        // Store prime square
        ArrayList<Long> primsqure = new ArrayList<>();
        for(int i = 2; i<= limit ; i++){
            if(prime[i]){
                primsqure.add((long)i*i);

            }
        }
        //Answer each quries
        for(long val: query){
            int count = 0 ;
            for(long sq : primsqure ){
                if(sq <= val) count++;
                else break;
            }
            ans.add(count);
        }
        return ans;
    }

}

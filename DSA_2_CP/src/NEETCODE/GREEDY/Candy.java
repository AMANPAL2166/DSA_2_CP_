package NEETCODE.GREEDY;

import java.util.Arrays;

public class Candy {
    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int candiesCount = 0;
        Arrays.fill(candies, 1);
        //left-> right
        for(int i = 1;i<ratings.length;i++){
            if(ratings[i]> ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        //right-> left
        for(int i =ratings.length-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }
        for(int i = 0 ;i<candies.length;i++){
            candiesCount += candies[i];
        }
        return candiesCount;

    }

    public static void main(String[] args) {
        int[] rating = {1, 2, 10, 8, 7, 3};
        System.out.println("Maximum candies  required are " + candy(rating));
    }
}

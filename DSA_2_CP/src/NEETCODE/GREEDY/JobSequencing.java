package NEETCODE.GREEDY;

import NEETCODE.BINARY_SEARCH.Key_Store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Job{
    //Job Id
    int id;
    //Deadline of job
    int deadline;
    //Profit
    int profit;
}

public class JobSequencing {
    public static boolean comparision(Job a,  Job b) {
        //Return true if a's profit is greater than b's proft
        return a.profit>b.profit;
    }
    //Function to find maximum profit and number of jobs
    public static  int[] jobScheduling(Job[] arr, int n) {
        //Sort the array by job profit in descending order
        Arrays.sort(arr, (a,b)->b.profit-a.profit);
        //find maximum deadline among all jobs
        int maxi = arr[0].deadline;
        for(int i = 1;i<n;i++ ){
            //find the latest deadline
            maxi = Math.max(maxi, arr[i].deadline);
        }
        //Create an array to strore the slot for the jobs
        int[] slot = new int[maxi+1];
        //Initialize with -1
        Arrays.fill(slot, -1);
        int countJob = 0, profitJob = 0;
        //try to assign jobs to the slots
        for(int i = 0;i<n ;i++){
            //Find a slot for the current job, starting from the job's deadline
            for(int j = arr[i].deadline;j>0;j--){
                //If the slot is available
                if(slot[j] == -1){
                    //assign the job to the slot
                    slot[j] = i;
                    //increment the job count
                    countJob++;
                    //Add the profit of the job
                    profitJob += arr[i].profit;
                    break;
                }
            }
        }
        //return pair of countjob and profitjob
        return new int[]{countJob, profitJob};

    }
    public static void main(String[] args) {

        // Driver Code
        int n = 4;

        // Define the edges (source, destination, weight)
        Job[] arr = new Job[]{
                new Job() {{
                    id = 1;
                    deadline = 4;
                    profit = 20;
                }},
                new Job() {{
                    id = 2;
                    deadline = 1;
                    profit = 10;
                }},
                new Job() {{
                    id = 3;
                    deadline = 2;
                    profit = 40;
                }},
                new Job() {{
                    id = 4;
                    deadline = 2;
                    profit = 30;
                }}
        };
        // Receive the array result
        int[] ans = jobScheduling(arr, n);

        // Output: 2 60
        System.out.println(ans[0] + " " + ans[1]);

    }
}

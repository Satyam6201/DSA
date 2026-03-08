package greedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class Question {
    
    // Qs.6:-

    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p){
            id = i;
            profit = p;
            deadline = d;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // QS.3(min abs value of the pair):- O(nlogn)

        // int A[] = {4, 1, 8, 7};
        // int B[] = {2, 3, 6, 5};
        // Arrays.sort(A);
        // Arrays.sort(B);
        // int minDiff = 0;
        // for(int i = 0; i< A.length; i++){
        //     minDiff += Math.abs(A[i] - B[i]);
        // }
        // System.out.println("Minimum absolute Difference of the pair = " + minDiff);

        // QS.4(max length chain of the pair):-

        // int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};  // O(nlogn)
        // Arrays.sort(pairs, Comparator.comparing(o -> o[1]));
        // ArrayList <Integer> ans = new ArrayList<>();
        // int chainLength = 1;
        // int chainend = pairs[0][1];
        // ans.add(0);
        // for(int i = 1; i< pairs.length; i++){
        //     if(pairs[i][0] > chainend){
        //         chainLength++;
        //         ans.add(i);
        //         chainend = pairs[i][1];
        //     }
        // }
        // System.out.println("Chain length = " + chainLength);
        // for(int i = 0; i< ans.size(); i++){
        //     System.out.print("A" + ans.get(i) + " ");
        // }
        // System.out.println();

        // QS.5(Indian Coins):-

        // Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        // Arrays.sort(coins, Comparator.reverseOrder());
        // ArrayList <Integer> ans = new ArrayList<>();
        // int countOfCoin = 0;
        // int amount = 596;
        // for(int i = 0; i< coins.length; i++){
        //     if(coins[i] <= amount){
        //         while(coins[i] <= amount){
        //             countOfCoin++;
        //             ans.add(coins[i]);
        //             amount -= coins[i];
        //         }
        //     }
        // }
        // System.out.println("Total coins used = "+ countOfCoin + " ");
        // for(int i = 0; i< ans.size(); i++){
        //     System.out.print(ans.get(i) + " ");
        // }
        // System.out.println();
        
        // QS.6(job sequence problem)

        // int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 20}};
        // ArrayList <Job> jobs = new ArrayList<>();

        // for(int i = 0; i< jobInfo.length; i++){
        //     jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        //     // i = id, jobInfo[i][0] = deadline, jobInfo[i][1] = profit
        // }

        // // Sorthing of the object:-(in descending order)
        // Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        // ArrayList<Integer> seq = new ArrayList<>();
        // int time = 0;

        // for(int i = 0; i< jobs.size(); i++){
        //     Job curr = jobs.get(i);
        //     if(curr.deadline > time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }

        // // Print seq :-
        // System.out.println("Max Jobs = "+ seq.size());
        // for(int i = 0; i< seq.size(); i++){
        //     System.out.print(seq.get(i)+ " "); // 2({1, 40}), 0({4, 20})
        // }
        // System.out.println();
       
        // Qs.7:-

        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0; //Horizontal
        int v = 0; // Vertical
        int hp = 1; // Horizontal Point 
        int vp = 1; // Vertical Point
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if(costVer[v] <= costHor[h]){  // Horizental cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else{
                cost += (costVer[v] * hp);  // Vertical Cut
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minmum cost of cuts = "+ cost);
    }
}

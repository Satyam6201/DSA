package Heap;

import java.util.PriorityQueue;

public class Question {

    // QS.1:- (Near by car):- 
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSqu;
        int index;

        public Point(int x, int y, int distSqu, int index) {
            this.x = x;
            this.y = y;
            this.distSqu = distSqu;
            this.index = index;
        }

        @Override
        public int compareTo(Point p1) {
            return this.distSqu - p1.distSqu;
        }
    }

    // QS.3:- Soldiers and civilion 

    static class Row implements Comparable<Row> {
        int soldiers;
        int index;

        public Row(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }
        
        @Override
        public int compareTo(Row r2) {
            if(this.soldiers == r2.soldiers) {
                return this.index - r2.index;
            }
            else{
                return this.soldiers = r2.soldiers;
            }
        }
    }

    // QS.4 : (Sliding window maximum)

    static class Pair implements Comparable<Pair> {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;  // for decending order
        }
    }
    public static void main(String[] args) {

        // QS.1:- (Near by car):- 
        // int dist[][] = {{3, 3}, {5, -1}, {-2, 4}};
        // int k = 2;
        // PriorityQueue<Point> pq = new PriorityQueue<>();
        // for(int i = 0; i< dist.length; i++) {
        //     int distSqu = dist[i][0]*dist[i][0] + dist[i][1]*dist[i][1];
        //     pq.add(new Point(dist[i][0], dist[i][1], distSqu, i));
        // }
        // // nearset k cars:-
        // for(int i = 0; i< k; i++) {
        //     System.out.println("C" + pq.remove().index);
        // }
      
        // QS.2":- Connect N Ropes:-

        // int ropes[] = {2, 3, 3, 4, 6};

        // PriorityQueue <Integer> pq = new PriorityQueue<>();
        // for(int i = 0; i< ropes.length; i++) {
        //     pq.add(ropes[i]);
        // }
        
        // int cost = 0;

        // while (pq.size() > 1) {
        //     int min1 = pq.remove();
        //     int min2 = pq.remove();
        //     cost += min1 + min2;
        //     pq.add(min1 + min2);
        // }
        // System.out.println("Total cost for the connecting the ropes = " + cost); //Total cost for the connecting the ropes = 41

        // QS.3 :- (Soldiers and civilions):-

        // int armys[][] = {
        //                     {1, 0, 0, 0},
        //                     {1, 1, 1, 1},
        //                     {1, 0, 0, 0},
        //                     {1, 0, 0, 0}
                          
        // };
        // int k = 2;

        // PriorityQueue<Row> pq = new PriorityQueue<>();

        // for(int i = 0; i< armys.length; i++) {
        //     int count = 0;
        //     for(int j = 0; j < armys[0].length; j++){
        //         count += armys[i][j] == 1 ? 1 : 0;
        //     }
        //     pq.add(new Row(count, i));
        // }
        // for(int i = 0; i< k; i++) {
        //     System.out.println("R" + pq.remove().index);
        // }
    
    // QS.4:- (Sliding window maximum):-

        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
    
        int result[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window :-
        for(int i = 0; i< k; i++) {
            pq.add(new Pair(arr[i], i));
        }
    
        result[0] = pq.peek().val;

        for(int i = k; i< arr.length; i++) {
            while (pq.size() > 0 && pq.peek().index <= (i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            result[i-k+1] = pq.peek().val;
        }

        // Printing result:-
        for(int i = 0; i< result.length; i++) {
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }
}

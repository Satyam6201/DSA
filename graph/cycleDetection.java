package graph;

import java.util.ArrayList;

public class cycleDetection {
    static class Edge{
        int src; // source
        int dist;  //distination

        public Edge(int src, int dist) {
            this.src = src;
            this.dist = dist;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i< graph.length; i++) {
            graph[i] = new ArrayList<>();  
        }

        // Undirected graph:- 

        /*
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
         */

         //directed graph:- 

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

     // Undirected graph:- 
    public static boolean detectCycle(ArrayList<Edge>[] graph) { //O(V + E)
        boolean visit[] = new boolean[graph.length];
        for(int i = 0; i< graph.length; i++) {
            if (!visit[i]) {
               if(detectCycleUtil(graph, visit, i, -1)) {
                return true;
                //cycle exists in one of the part
               }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean []visit, int curr, int parents) {
        visit[curr] = true;

        for(int i = 0; i< graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            //Case 3:- 
            if (!visit[e.dist]) {
                if (detectCycleUtil(graph, visit, e.dist, curr)) {
                    return true;
                }
            }

            // Case 1:-
            else if (visit[e.dist] && e.dist != parents) {
                return true;
            }

            // Case 2:- do nothing -> continue
        }
        return false;
    }
    
    //directed graph:- 

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i = 0; i< graph.length; i++) {
            if (!visit[i]) {
                if (isCycleUtil(graph, i, visit, stack)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit, boolean[] stack) {
        visit[curr] = true;
        stack[curr] = true;

        for(int i = 0; i< graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dist]) { //cycle
                return true;
            }

            if (!visit[e.dist] && isCycleUtil(graph, e.dist, visit, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    
    
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // System.out.println(detectCycle(graph));  //true

        System.out.println(isCycle(graph));//true
    }
}

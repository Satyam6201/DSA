package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class connected_Bfs_Dfs {
     static class Edge{
        int src; // source
        int dist;  //distination
        int wt; // weigth

        public Edge(int src, int dist, int wt) {
            this.src = src;
            this.dist = dist;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i< graph.length; i++) {
            graph[i] = new ArrayList<>();  
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));


        // Add 1 vertex:-
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // Add 2 vertex:-
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // Add 3 vertex:-
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));


        // Add 4 vertex:-
        graph[4].add(new Edge(4, 2,1));
        graph[4].add(new Edge(4, 3,1));
        graph[4].add(new Edge(4, 5,1));

        // Add 5 vertex:-
        graph[5].add(new Edge(5, 3,1));
        graph[5].add(new Edge(5, 4,1));
        graph[5].add(new Edge(5, 6,1));

        // Add 6 vertex:-
        graph[6].add(new Edge(6, 5,1));
    }

    // Connecting BFS:-
    public static void Bfs(ArrayList<Edge>[] graph){
        boolean visit[] = new boolean[graph.length];

        for(int i = 0; i< graph.length; i++) {
            if (!visit[i]) {
                BfsUtil(graph, visit);
            }
        }
    }

    public static void BfsUtil(ArrayList<Edge>[] graph, boolean visit[]) {  //O(V + E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // src = 0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if(!visit[curr]) {  // cisit current 
                System.out.print(curr + " ");
                visit[curr] = true;
                for(int i = 0; i< graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }

    // Connecting Dfs:-

    public static void Dfs(ArrayList<Edge>[] graph){
        boolean visit[] = new boolean[graph.length];
        for(int i = 0; i< graph.length; i++) {
            DfsUtil(graph, i, visit);
        }
    }

    public static void DfsUtil(ArrayList<Edge>[] graph, int curr, boolean [] visit) { //O(V + E)
        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i = 0; i< graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // get neighbors

            if (!visit[e.dist]) {
                DfsUtil(graph, e.dist, visit);  // for neighbors
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        BfsUtil(graph, new boolean[V]); //0 1 2 3 4 5 6 
        System.out.println();
        DfsUtil(graph, 0, new boolean[V]);  //0 1 3 4 2 5 6

    }
}

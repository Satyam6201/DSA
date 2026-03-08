package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_Dfs{
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

    public static void Bfs(ArrayList<Edge>[] graph) {  //O(V + E)
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
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

    public static void Dfs(ArrayList<Edge>[] graph, int curr, boolean [] visit) { //O(V + E)
        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i = 0; i< graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // get neighbors

            if (!visit[e.dist]) {
                Dfs(graph, e.dist, visit);  // for neighbors
            }
        }
    }

    // QS.1:- HasPath:-

    public static boolean  HasPath(ArrayList<Edge>[] graph, int src, int dist, boolean[] visit) { //O(V + E)
        if (src == dist) {
            return true;
        }

        visit[src] = true;

        for(int i = 0; i< graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            // e.dist = neighbors
            if (!visit[e.dist] && HasPath(graph, e.dist, dist, visit)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // Bfs(graph); //0 1 2 3 4 5 6
        // System.out.println();
        // Dfs(graph, 0, new boolean[V]); //0 1 3 4 2 5 6

        System.out.println(HasPath(graph, 0, 5, new boolean[V])); //true
        System.out.println(HasPath(graph, 0, 7, new boolean[V])); //false
    }
}

package graph;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSorting {
    static class Edge{
        int src;
        int dist;

        public Edge(int src, int dist) {
            this.src = src;
            this.dist = dist;
        } 
    }
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i< graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        boolean vist[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

            // Call DFS utility for unvisited nodes
        for(int i = 0; i< graph.length; i++) {
            if (!vist[i]) {
                topSortUtil(graph, i, vist, s);
            }
        }

          // Print vertices in topologically sorted order
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    /**
     * Utility function for DFS-based topological sort.
     * Marks the current node as visited, explores its neighbors recursively,
     * and pushes the current node to the stack after visiting all neighbors.
     */
    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vist[], Stack<Integer> s) {
        vist[curr] = true;

        for(int i = 0; i< graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vist[e.dist]) {
                topSortUtil(graph, e.dist, vist, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int V = 6; 
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
}

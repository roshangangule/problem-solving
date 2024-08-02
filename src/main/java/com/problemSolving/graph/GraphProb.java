package com.problemSolving.graph;

import java.util.*;

public class GraphProb {

    //graph travasal and BFS(Level Order)
    public static void main(String[] args) {
        int [][] arr = {{3,1,2,4,0,4,5,0},{4,2,3,6,1,5,6,3}};
        int n = 7;
        int m = 8;
        List<List<Integer>> graph = constructionGraph(n,m,arr);
        System.out.println("Constructed graph :: "+graph);
        bfs(n,m,arr);
    }

    private static void bfs(int n, int m, int[][] arr) {
        List<List<Integer>> graph = constructionGraph(n,m,arr);

        Queue<Integer> queue = new LinkedList<>();
        Boolean[] visited = new Boolean[7];
        Arrays.fill(visited, false);
        queue.add(0);
        visited[0] = true;
        System.out.print("BFS :: ");
        while (!queue.isEmpty()) {
            int ans = queue.remove();
            List<Integer> nbrs = graph.get(ans);
            for (int v: nbrs) {
                if (visited[v] == false) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
            System.out.print(ans+" ");
        }
    }

    private static List<List<Integer>> constructionGraph(int n, int m, int[][] arr) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = arr[0][i];
            int v = arr[1][i];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }

}

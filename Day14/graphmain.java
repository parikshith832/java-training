package Day14;

import java.util.*;

class GraphMatrix {
    int vertices;
    int Matrix[][];

    GraphMatrix(int v) {
        vertices = v;
        Matrix = new int[v][v];

    }

    void addEdge(int u, int v) {
        Matrix[u][v] = 1;
        Matrix[v][u] = 1;

    }

    void printGraph() {
        System.out.println("Matrix representation");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class GraphList {
    int vertices;
    ArrayList<ArrayList<Integer>> list;

    GraphList(int v) {
        vertices = v;
        list = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());

        }

    }

    void addEdge(int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    void printGraph() {
        System.out.println("List representation");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + "->");
            for (int j : list.get(i)) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    void BFS(int start) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbour : list.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        System.out.println();
    }

    void DFS(int node, boolean visited[]) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : list.get(node)) {
            if (!visited[neighbour]) {
                DFS(neighbour, visited);
            }
        }
    }
}

public class graphmain {
    public static void main(String[] args) {
        int v = 4;
        GraphList g = new GraphList(v);
        boolean visited[] = new boolean[v];
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.printGraph();
        System.out.println("BFS Traversal:");
        g.BFS(0);
        g.DFS(0, visited);
        GraphMatrix gm = new GraphMatrix(4);
        gm.addEdge(0, 1);
        gm.addEdge(0, 2);
        gm.addEdge(1, 3);
        gm.printGraph();
    }
}

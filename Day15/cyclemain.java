
package Day15;

import java.util.ArrayList;
import java.util.List;

public class cyclemain {
    static class Graph {
        int V;
        List<List<Integer>> adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean dfs(int node, int parent, boolean visited[]) {
            visited[node] = true;
            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    if (dfs(neighbour, node, visited))
                        return true;
                } else if (neighbour != parent) {
                    return true;
                }
            }
            return false;
        }

        boolean hasCycle() {
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i])
                    if (dfs(i, -1, visited))
                        return true;

            }
            return false;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        Graph g = new Graph(V);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        // g.addEdge(4, 1);

        if (g.hasCycle()) {
            System.out.println("Cycle Detected");
        } else
            System.out.println("Not Detected");
    }
}

package Day15;

import java.util.*;

public class dijkmain {
    static int minDistance(int d[], boolean visited[], int V) {
        int min = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < V; i++) {
            if (!visited[i] && d[i] < min) {// it should not be visited and the distance of the element should be lesser
                                            // than the minimum to get the lowest distance.
                min = d[i];
                index = i;
            }
        }
        return index;
    }

    static void dijkstra(int V, List<int[]> edges, int src) {
        int d[] = new int[V];
        boolean visited[] = new boolean[V];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[src] = 0;
        for (int i = 0; i < V - 1; i++) {
            int u = minDistance(d, visited, V);
            visited[u] = true;
            for (int e[] : edges) {
                int u1 = e[0];
                int v = e[1];
                int w = e[2];

                if (u1 == u && !visited[v] && d[u] != Integer.MAX_VALUE && d[u] + w < d[v]) {
                    d[v] = d[u] + w;
                }
            }
        }
        System.out.println("vertex distance from source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " " + d[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<int[]> edges = new ArrayList<>();
        edges.add(new int[] { 0, 1, 2 });
        edges.add(new int[] { 0, 2, 4 });
        edges.add(new int[] { 1, 2, 1 });
        edges.add(new int[] { 1, 3, 7 });
        edges.add(new int[] { 2, 4, 3 });
        edges.add(new int[] { 4, 3, 1 });
        dijkstra(V, edges, 0);

    }
}

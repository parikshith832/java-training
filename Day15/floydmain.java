package Day15;

public class floydmain {
    static final int INF = 999;

    static void floydWarshall(int graph[][], int V) {
        int dist[][] = new int[V][V];

        // Step 1: Copy graph to dist matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Step 2: Floyd-Warshall Algorithm
        for (int k = 0; k < V; k++) { // intermediate vertex
            for (int i = 0; i < V; i++) { // source
                for (int j = 0; j < V; j++) { // destination

                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Step 3: Print result
        System.out.println("Shortest distance matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int graph[][] = {
                { 0, 3, INF, 7 },
                { 8, 0, 2, INF },
                { 5, INF, 0, 1 },
                { 2, INF, INF, 0 }
        };

        floydWarshall(graph, V);
    }
}
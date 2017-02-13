package Utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * About the code :
 */
public class Utils {
    /*
    * Usage: Utils.GCD(a, b)*/
    public static int GCD(int a, int b) {
        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // Usage: Utils.LCM(a, b)
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static class Edge {
        public int u = 0;
        public int v = 0;
        public int weight = 0;

        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
            this.weight = 1;
        }

        public Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    public static class Graph {
        List<Edge> edges = new LinkedList<>();

        public void addEdge(Edge uv) {
            this.edges.add(uv);
        }

        public Edge getEdge(int i) {
            return this.edges.get(i);
        }

        public List<Edge> getAllEdges() {
            List<Edge> allEdges = new LinkedList<Edge>();
            allEdges.addAll(this.edges);
            return allEdges;
        }
    }

    public static class MatrixGraph {
        int[][] graph = null;
        private int noOfNodes = 0;
        private boolean isDirected = false;

        public MatrixGraph(int noOfNodes) {
            this.noOfNodes = noOfNodes;
            graph = new int[noOfNodes + 1][noOfNodes + 1];
            for (int i = 0; i <= noOfNodes; i++) {
                Arrays.fill(graph[i], 0);
            }
        }

        public MatrixGraph(int noOfNodes, boolean directed) {
            this.noOfNodes = noOfNodes;
            this.isDirected = true;
            graph = new int[noOfNodes + 1][noOfNodes + 1];
            for (int i = 0; i <= noOfNodes; i++) {
                Arrays.fill(graph[i], 0);
            }

        }

        public void addEdge(int u, int v) {
            if (isDirected) {
                graph[u][v] = 1;
            } else {
                graph[u][v] = 1;
                graph[v][u] = 1;
            }

        }

        public void addWeightedEdge(int u, int v, int weight) {
            if (isDirected) {
                graph[u][v] = weight;
            } else {
                graph[u][v] = weight;
                graph[v][u] = weight;
            }
        }

        public int noOfEdges() {
            int edgeSize = 0;
            for (int i = 1; i < noOfNodes + 1; i++) {
                for (int j = 1; j < noOfNodes + 1; j++) {
                    if (graph[i][j] > 0) {
                        edgeSize++;
                    }
                }
            }
            return edgeSize;
        }

    }

}

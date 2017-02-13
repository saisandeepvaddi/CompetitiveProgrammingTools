package Utils;

import java.util.List;

/**
 * About the code :
 */
public class UtilTest {
    public static void main(String[] args) {
        Utils.Graph graph = new Utils.Graph();
        graph.addEdge(new Utils.Edge(1, 2));
        graph.addEdge(new Utils.Edge(0, 1, 5));
        List<Utils.Edge> edges = graph.getAllEdges();
        
    }
}

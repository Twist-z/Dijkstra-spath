import spath.ShortestPaths;
import spath.graphs.*;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a graph
        DirectedGraph graph = new DirectedGraph();
        
        Vertex A = new Vertex();
        Vertex B = new Vertex();
        Vertex C = new Vertex();
        Vertex D = new Vertex();

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);

        Edge AB = new Edge(A, B);
        Edge AC = new Edge(A, C);
        Edge BC = new Edge(B, C);
        Edge CD = new Edge(C, D);
        Edge BD = new Edge(B, D);

        graph.addEdge(AB);
        graph.addEdge(AC);
        graph.addEdge(BC);
        graph.addEdge(CD);
        graph.addEdge(BD);

        // Step 2: Assign weights
        HashMap<Edge, Integer> weights = new HashMap<>();
        weights.put(AB, 2);
        weights.put(AC, 4);
        weights.put(BC, 1);
        weights.put(CD, 2);
        weights.put(BD, 5);

        // Step 3: Run Dijkstra's algorithm
        ShortestPaths sp = new ShortestPaths(graph, weights, A);
        sp.run();

        // Step 4: Get the shortest path from A to D
        LinkedList<Edge> path = sp.returnPath(D);
        int totalDistance = sp.returnLength(D);

        System.out.println("Shortest path from A to D:");
        for (Edge e : path) {
            System.out.println(e);
        }
        System.out.println("Total path length: " + totalDistance);
    }
}

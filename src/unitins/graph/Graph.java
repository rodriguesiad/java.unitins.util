package unitins.graph;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Node> shortestPath = new ArrayList<Node>();
    private ArrayList<Node> nodeList = new ArrayList<Node>();
    public ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
    private int currentPathCost = Integer.MAX_VALUE;

    public Node addNode(String info) {
        Node newNode = new Node(info);
        nodeList.add(newNode);

        return newNode;
    }

    public Node getNode(String info) {
        Node response = null;

        for (Node node : nodeList) {
            if (node.getInfo().equals(info)) {
                response = node;
            }
        }

        if (response == null) {
            throw new RuntimeException("The " + info + " was not found");
        }

        return response;
    }

    public void createVertex(String nodeA, String nodeB, int cost) {
        createVertex(getNode(nodeA), getNode(nodeB), cost);
    }

    public void createVertex(Node nodeA, Node nodeB, int cost) {
        Vertex newVertex = new Vertex(nodeA, nodeB, cost);
        nodeA.getVertexList().add(newVertex);
        nodeB.getVertexList().add(newVertex);
        vertexList.add(newVertex);
    }

    public void printAllPathsFromTo(Node nodeA, Node nodeB) {
        ArrayList<Node> path = new ArrayList<>();
        ArrayList<Vertex> edges = new ArrayList<>();
        path.add(nodeA);
        printAllPathsUtil(nodeA, nodeB, path, edges);
    }

    private void printAllPathsUtil(Node nodeA,
                           Node nodeB,
                           ArrayList<Node> nodeList,
                           ArrayList<Vertex> edgeList) {

        if (nodeA.equals(nodeB)) {
            if (pathCost(edgeList) < currentPathCost) {
                shortestPath.clear();
                shortestPath.addAll(nodeList);
                currentPathCost = pathCost(edgeList);
            }

            return;
        }

        for (Vertex vertex: nodeA.getVertexList()) {
            Node visited = vertex.getNodeB();
            if (!nodeList.contains(visited)) {
                nodeList.add(visited);
                edgeList.add(vertex);
                printAllPathsUtil(visited, nodeB, nodeList, edgeList);
                nodeList.remove(visited);
                edgeList.remove(vertex);
            }
        }
    }

    int pathCost(ArrayList<Vertex> edgeList) {
        int cost = 0 ;
        for (Vertex vertex: edgeList) {
            cost += vertex.getCost();
        }
        return cost;
    }

}
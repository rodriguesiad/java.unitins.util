package unitins.graph;

public class Vertex {

    private Node nodeA = null;
    private Node nodeB = null;
    private int cost = 0;

    public Vertex(Node nodeA, Node nodeB, int cost) {
        this.nodeA = nodeA;
        this.nodeB = nodeB;
        this.cost = cost;
    }

    public String toString() {
        return nodeA.getInfo() + " <--" + cost + "--> " + nodeB.getInfo();
    }

    public Node getNodeA() {
        return nodeA;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}

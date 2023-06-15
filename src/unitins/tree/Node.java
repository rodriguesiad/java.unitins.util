package unitins.tree;

public class Node {

    private String information;
    private Node leftNodeTree;
    private Node rightNodeTree;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Node getLeftNode() {
        return leftNodeTree;
    }

    public void setLeftNode(Node leftNodeTree) {
        this.leftNodeTree = leftNodeTree;
    }

    public Node getRightNode() {
        return rightNodeTree;
    }

    public void setRightNode(Node rightNodeTree) {
        this.rightNodeTree = rightNodeTree;
    }

    public Node(String information) {
        this.information = information;
        this.leftNodeTree = null;
        this.rightNodeTree = null;
    }

    @Override
    public String toString() { return information; }
}

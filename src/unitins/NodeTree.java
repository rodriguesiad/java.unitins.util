package unitins.tree;

public class NodeTree {

    private String information;
    private NodeTree leftNodeTree;
    private NodeTree rightNodeTree;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public NodeTree getLeftNode() {
        return leftNodeTree;
    }

    public void setLeftNode(NodeTree leftNodeTree) {
        this.leftNodeTree = leftNodeTree;
    }

    public NodeTree getRightNode() {
        return rightNodeTree;
    }

    public void setRightNode(NodeTree rightNodeTree) {
        this.rightNodeTree = rightNodeTree;
    }

    public NodeTree(String information) {
        this.information = information;
        this.leftNodeTree = null;
        this.rightNodeTree = null;
    }

    @Override
    public String toString() { return information; }
}

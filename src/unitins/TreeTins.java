package unitins.tree;

public class TreeTins {

    private NodeTree rootNodeTree = null;

    public boolean isEmpty() {
        return rootNodeTree == null;
    }

    private void addNode(String info, NodeTree subRoot) {
        if (isEmpty()) {
            rootNodeTree = new NodeTree(info);
        } else {
            if (info.compareTo(subRoot.getInformation()) > 0) {
                if (subRoot.getRightNode() == null) {
                    subRoot.setRightNode(new NodeTree(info));
                    return;
                } else {
                    addNode(info, subRoot.getRightNode());
                }
            } else if (info.compareTo(subRoot.getInformation()) < 0) {
                if (subRoot.getLeftNode() == null) {
                    subRoot.setLeftNode(new NodeTree(info));
                    return;
                } else {
                    addNode(info, subRoot.getLeftNode());
                }
            }
        }
    }

    public void add(String info) {
        addNode(info, rootNodeTree);
    }

    private void preOrder(NodeTree subRoot) {
        if (subRoot == null) {
            return;
        }

        System.out.println(subRoot.getInformation() + " ");
        preOrder(subRoot.getLeftNode());
        preOrder(subRoot.getRightNode());
    }

    private void inOrder(NodeTree subRoot) {
        if (subRoot == null) {
            return;
        }

        preOrder(subRoot.getLeftNode());
        System.out.println(subRoot.getInformation() + " ");
        preOrder(subRoot.getRightNode());
    }

    private void posOrder(NodeTree subRoot) {
        if (subRoot == null) {
            return;
        }

        preOrder(subRoot.getLeftNode());
        preOrder(subRoot.getRightNode());
        System.out.println(subRoot.getInformation() + " ");
    }

    public void preOrder() {
        preOrder(rootNodeTree);
    }

    public void inOrder() {
        inOrder(rootNodeTree);
    }

    public void posOrder() {
        posOrder(rootNodeTree);
    }

}

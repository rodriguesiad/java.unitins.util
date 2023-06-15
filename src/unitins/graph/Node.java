package unitins.graph;

import java.util.ArrayList;

public class Node {

    private String info = "";
    private ArrayList<Vertex> vertexList;

    public Node(String info) {
        this.info = info;
        vertexList = new ArrayList<Vertex>();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(ArrayList<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

}
package model;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Edge> edges;
    private ArrayList<Vertex> vrtx;

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public ArrayList<Vertex> getVrtx() {
        return vrtx;
    }

    public void setVrtx(ArrayList<Vertex> vrtx) {
        this.vrtx = vrtx;
    }

    private Vertex source;
    private Vertex sink;

    public Graph() {
        edges = new ArrayList();
        vrtx = new ArrayList();
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getSink() {
        return sink;
    }

    public void setSink(Vertex sink) {
        this.sink = sink;
    }

    public void addEdge(Vertex start, Vertex end, int capacity) {
        Edge edg = new Edge(start, end, capacity);
        edges.add(edg);
        start.getNeighbours().add(edg);
        end.getNeighbours().add(edg);
    }

    public void addVertex(char newVertex) {
        vrtx.add(new Vertex(newVertex));
    }

    public int getTotalFlow() {
        int total_flow = 0;
        for (Edge e : this.source.getNeighbours()) {
            total_flow += e.getFlow();
        }
        return total_flow;
    }

    public Vertex getVertexByName(char name) {
        for (Vertex v : getVrtx()) {
            if (v.getName() == name) {
                return v;
            }
        }
        return null;
    }
}

package model;

import java.util.ArrayList;

public class Graph {
    ArrayList<Edge> edges;
    ArrayList<Vertex> vrtx;
    
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

    void addEdge(Vertex start, Vertex end, int capacity){
        Edge edg = new Edge(start, end, capacity);
        edges.add(edg);
        start.neighbours.add(edg);
        end.neighbours.add(edg);
    }

    void addVertex(char newVertex){
        vrtx.add(new Vertex(newVertex));
    }
    
    int getTotalFlow(){
        int total_flow = 0;
        for (Edge e : this.source.neighbours) {
            total_flow += e.flow;
        }
        return total_flow;
    }
}

package model;

import java.util.ArrayList;

public class Vertex {
    private char name;
    private Edge cameFrom;
    private ArrayList<Edge> neighbours;
    private boolean visited;

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    } 

    public Edge getCameFrom() {
        return cameFrom;
    }

    public void setCameFrom(Edge cameFrom) {
        this.cameFrom = cameFrom;
    }

    public ArrayList<Edge> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<Edge> neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public Vertex(char name) {
        this.name = name;
        neighbours = new ArrayList();
        visited = false;
        cameFrom = null;
    }
    
    
}

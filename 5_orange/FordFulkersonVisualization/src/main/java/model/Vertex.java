package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Vertex  implements Serializable{
    private char name;
    private Edge cameFrom;
    private ArrayList<Edge> neighbours;
    private Boolean visited;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.name;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertex other = (Vertex) obj;
        if (this.name != other.name) {
            return false;
        }
        return true;
    }
    
    
}

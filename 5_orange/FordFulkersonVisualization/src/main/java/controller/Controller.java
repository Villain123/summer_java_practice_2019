/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import model.BFS;
import model.DFS;
import model.Edge;
import model.FordFulkerson;
import model.Graph;
import model.Vertex;

/**
 *
 * @author duyenNH
 */
public class Controller {

    public Graph graph;

    private LinkedList<Graph> result;

    public Controller() {
        this.graph = new Graph();
    }

    public void addEdge(Vertex start, Vertex end, int capacity) {
        graph.addEdge(start, end, capacity);
    }

    public void addVertex(char newVertex) {
        graph.addVertex(newVertex);
    }

    public void process() {
        result = FordFulkerson.process(graph, new DFS());
        for(int i = 0;i<result.size();i++){
            System.out.println(i+"  "+result.get(i).getTotalFlow());
        }
    }
    
    public int getNumberOfStep(){
        return result.size();
    }
    public Graph getStep(int typeStep) {
        if(typeStep == 0) return graph;
        if (typeStep < result.size() && typeStep >= 0) {
            return result.get(typeStep);
        } else {
            return null;
        }
    }

    public void saveFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(graph.getVrtx().size() + "\n");
        for (Vertex v : graph.getVrtx()) {
            fw.write(v.getName() + "\n");
        }
        fw.write(graph.getEdges().size() + "\n");
        for (Edge e : graph.getEdges()) {
            fw.write(e.getStart().getName() + " " + e.getEnd().getName() + " " + e.getCapacity() + "\n");
        }
        if (graph.getSource() != null) {
            fw.write(graph.getSource().getName());
        } else {
            fw.write('#');
        }
        fw.write('\n');
        if (graph.getSink() != null) {
            fw.write(graph.getSink().getName());
        } else {
            fw.write('#');
        }
        fw.close();
    }

    public void loadFile(String fileName) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(fileName);
        Scanner sc = new Scanner(fr);        
        graph = new Graph();
        
        int V = sc.nextInt();
        for (int i = 0; i < V; i++) {
            graph.addVertex(sc.next().charAt(0));
        }
        int E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            Vertex start = graph.getVertexByName(sc.next().charAt(0));
            Vertex end = graph.getVertexByName(sc.next().charAt(0));
            int capacity = sc.nextInt();
            graph.addEdge(start, end, capacity);
        }
        char srcName = sc.next().charAt(0);
        if (srcName != '#') {
            //Vertex src = graph.getVertexByName(srcName);
            graph.setSource(graph.getVertexByName(srcName));
        }
        char sinkName = sc.next().charAt(0);
        if (sinkName != '#') {
            graph.setSink(graph.getVertexByName(sinkName));
        }
        fr.close();
    }
}

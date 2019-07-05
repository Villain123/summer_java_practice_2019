/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JPanel;
import model.Edge;
import model.Graph;
import model.Vertex;

/**
 *
 * @author theph
 */
public class GraphDisplayFrame extends JPanel {

    HashMap<Character, GraphVertex> uiVMapping;
    //HashMap<Character, Vertex> contentVMapping;

    LinkedList<GraphEdge> uiEList;
    //HashMap<Character, Edge> contentEMapping;

    public void init(Graph graph) {
        uiVMapping = new HashMap<>();
        uiEList = new LinkedList<>();
        for (Vertex v : graph.getVrtx()) {
            GraphVertex gv = new GraphVertex(this, (int) (Math.random() * 400), (int) (Math.random() * 400), v);
            this.add(gv);
            uiVMapping.put(v.getName(), gv);
        }
        for (Edge e : graph.getEdges()) {
            char nameStart = e.getStart().getName();
            char nameEnd = e.getEnd().getName();
            GraphEdge ge = new GraphEdge(this, uiVMapping.get(nameStart), uiVMapping.get(nameEnd), e);
            this.add(ge);
            uiEList.add(ge);
        }
        this.repaint();
    }

    public GraphDisplayFrame() {
        this.setLayout(null);
    }

}

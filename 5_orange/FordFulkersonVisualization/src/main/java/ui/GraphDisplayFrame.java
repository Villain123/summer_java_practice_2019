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
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author theph
 */
public class GraphDisplayFrame extends JPanel {

    ArrayList<GraphElement> elements;

    public GraphDisplayFrame() {
        this.elements = new ArrayList<>();
        this.setLayout(null);
        GraphVertex v1 = new GraphVertex(this,100, 100);
        GraphVertex v2 = new GraphVertex(this,300, 200);
        
        this.add(v1);
        this.add(v2);
        this.add(new GraphEdge(this,v1,v2));
        
    }

}

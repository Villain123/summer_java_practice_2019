/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author theph
 */
public class GraphEdge extends GraphElement implements VertexPositionChangedListener{

    private GraphVertex v1, v2;
    
    public GraphEdge(JPanel parent, GraphVertex v1, GraphVertex v2) {
        super(parent);
//        int x = (v1.getX()<v2.getX()?v1.getX():v2.getX())+radius;
//        int y = (v1.getY()<v2.getY()?v1.getY():v2.getY())+radius;
//        
//        int sizeX = Math.abs(v1.getX()-v2.getX());
//        int sizeY = Math.abs(v1.getY()-v2.getY());
//        
//        this.setLocation(x, y);
//        this.setSize(sizeX, sizeY);
        this.v1 = v1;
        this.v2 = v2;
        v1.addVertexPositionChangedListener(this);
        v2.addVertexPositionChangedListener(this);
        recalculatePosition();
    }
    
    public void recalculatePosition(){
        int x = (v1.getX()<v2.getX()?v1.getX():v2.getX())+radius;
        int y = (v1.getY()<v2.getY()?v1.getY():v2.getY())+radius;
        
        int sizeX = Math.abs(v1.getX()-v2.getX());
        sizeX = Math.max(sizeX, 100);
        
        int sizeY = Math.abs(v1.getY()-v2.getY());
        sizeY = Math.max(sizeY, 100);
        
        this.setLocation(x, y);
        this.setSize(sizeX, sizeY);    
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(v1.getX()-getX()+radius, v1.getY()-getY()+radius, v2.getX()-getX()+radius, v2.getY()-getY()+radius);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        
        int textX = (v1.getX() + v2.getX()) / 2 - getX() + radius;
        int textY = (v1.getY() + v2.getY()) / 2 - getY() + radius;
        if(textY < 20) textY +=20;
        
        g.drawString(toString(), textX, textY );
    }

    @Override
    public void onPositionChanged(int newX, int newY) {
        recalculatePosition();
        parent.repaint();
    }
}

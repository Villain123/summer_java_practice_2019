/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group7304.fordfulkerson.ui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author theph
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    GraphDisplayFrame graphDisplay;

    public MainWindow() {
        initComponents();
        drawingPanel.setLayout(new GridLayout(1, 1));
        graphDisplay = new GraphDisplayFrame();
        graphDisplay.setBackground(Color.WHITE);
        drawingPanel.add(graphDisplay);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        panelStepNav = new javax.swing.JPanel();
        btnPrevStep = new javax.swing.JButton();
        btnNextStep = new javax.swing.JButton();
        lblStep = new javax.swing.JLabel();
        tpanelFunction = new javax.swing.JTabbedPane();
        panelConstruct = new javax.swing.JPanel();
        panelAddVertex = new javax.swing.JPanel();
        lblNameAddV = new javax.swing.JLabel();
        btnAddVertex = new javax.swing.JButton();
        txtNameAddV = new javax.swing.JTextField();
        panelAddEdge = new javax.swing.JPanel();
        btnAddEdge = new javax.swing.JButton();
        lblFromAddE = new javax.swing.JLabel();
        txtFromAddE = new javax.swing.JTextField();
        lblToAddE = new javax.swing.JLabel();
        txtToAddE = new javax.swing.JTextField();
        lblCapacityAddE = new javax.swing.JLabel();
        txtCapacityAddE = new javax.swing.JTextField();
        panelDeleteVertex = new javax.swing.JPanel();
        btnDeleteVertex = new javax.swing.JButton();
        lblNameDeleteV = new javax.swing.JLabel();
        txtNameDeleteV = new javax.swing.JTextField();
        panelDeleteEdge = new javax.swing.JPanel();
        btnDeleteEdge = new javax.swing.JButton();
        lblIdDeleteE = new javax.swing.JLabel();
        txtIdDeleteE = new javax.swing.JTextField();
        lblAddV = new javax.swing.JLabel();
        lblAddE = new javax.swing.JLabel();
        lblDeleteV = new javax.swing.JLabel();
        lblDeleteE = new javax.swing.JLabel();
        panelRun = new javax.swing.JPanel();
        btnRun = new javax.swing.JButton();
        lblRunStatus = new javax.swing.JLabel();
        panelLog = new javax.swing.JPanel();
        scrLog = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnLoad = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnPrevStep.setText("Previous");
        btnPrevStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevStepMouseClicked(evt);
            }
        });

        btnNextStep.setText("Next");
        btnNextStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextStepMouseClicked(evt);
            }
        });

        lblStep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStep.setText("step / total_step");
        lblStep.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelStepNavLayout = new javax.swing.GroupLayout(panelStepNav);
        panelStepNav.setLayout(panelStepNavLayout);
        panelStepNavLayout.setHorizontalGroup(
            panelStepNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStepNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrevStep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStep, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextStep)
                .addContainerGap())
        );
        panelStepNavLayout.setVerticalGroup(
            panelStepNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStepNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStepNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevStep)
                    .addComponent(btnNextStep)
                    .addComponent(lblStep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAddVertex.setName(""); // NOI18N

        lblNameAddV.setText("Name");

        btnAddVertex.setLabel("Add vertex");
        btnAddVertex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddVertexMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAddVertexLayout = new javax.swing.GroupLayout(panelAddVertex);
        panelAddVertex.setLayout(panelAddVertexLayout);
        panelAddVertexLayout.setHorizontalGroup(
            panelAddVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddVertexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddVertexLayout.createSequentialGroup()
                        .addComponent(lblNameAddV)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameAddV)))
                .addContainerGap())
        );
        panelAddVertexLayout.setVerticalGroup(
            panelAddVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddVertexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameAddV)
                    .addComponent(txtNameAddV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddVertex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddVertex.getAccessibleContext().setAccessibleName("");
        btnAddVertex.getAccessibleContext().setAccessibleDescription("");

        btnAddEdge.setLabel("Add edge");
        btnAddEdge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEdgeMouseClicked(evt);
            }
        });

        lblFromAddE.setText("From");

        lblToAddE.setText("To");

        lblCapacityAddE.setText("Capacity");

        javax.swing.GroupLayout panelAddEdgeLayout = new javax.swing.GroupLayout(panelAddEdge);
        panelAddEdge.setLayout(panelAddEdgeLayout);
        panelAddEdgeLayout.setHorizontalGroup(
            panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddEdgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddEdgeLayout.createSequentialGroup()
                        .addGroup(panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFromAddE)
                            .addComponent(lblToAddE))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFromAddE)
                            .addComponent(txtToAddE)))
                    .addGroup(panelAddEdgeLayout.createSequentialGroup()
                        .addComponent(lblCapacityAddE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCapacityAddE)))
                .addContainerGap())
        );
        panelAddEdgeLayout.setVerticalGroup(
            panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddEdgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFromAddE)
                    .addComponent(txtFromAddE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToAddE)
                    .addComponent(txtToAddE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacityAddE)
                    .addComponent(txtCapacityAddE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddEdge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDeleteVertex.setLabel("Delete Vertex");
        btnDeleteVertex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteVertexMouseClicked(evt);
            }
        });

        lblNameDeleteV.setText("Name");

        javax.swing.GroupLayout panelDeleteVertexLayout = new javax.swing.GroupLayout(panelDeleteVertex);
        panelDeleteVertex.setLayout(panelDeleteVertexLayout);
        panelDeleteVertexLayout.setHorizontalGroup(
            panelDeleteVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteVertexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeleteVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteVertex, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addGroup(panelDeleteVertexLayout.createSequentialGroup()
                        .addComponent(lblNameDeleteV)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameDeleteV)))
                .addContainerGap())
        );
        panelDeleteVertexLayout.setVerticalGroup(
            panelDeleteVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteVertexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeleteVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameDeleteV)
                    .addComponent(txtNameDeleteV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteVertex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDeleteEdge.setLabel("Delete edge");
        btnDeleteEdge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteEdgeMouseClicked(evt);
            }
        });

        lblIdDeleteE.setText("Id");

        javax.swing.GroupLayout panelDeleteEdgeLayout = new javax.swing.GroupLayout(panelDeleteEdge);
        panelDeleteEdge.setLayout(panelDeleteEdgeLayout);
        panelDeleteEdgeLayout.setHorizontalGroup(
            panelDeleteEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteEdgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeleteEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteEdge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDeleteEdgeLayout.createSequentialGroup()
                        .addComponent(lblIdDeleteE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdDeleteE)))
                .addContainerGap())
        );
        panelDeleteEdgeLayout.setVerticalGroup(
            panelDeleteEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeleteEdgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeleteEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdDeleteE)
                    .addComponent(txtIdDeleteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteEdge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAddV.setText("Add vertex");

        lblAddE.setText("Add edge");

        lblDeleteV.setText("Delete vertex");

        lblDeleteE.setText("Delete edge");

        javax.swing.GroupLayout panelConstructLayout = new javax.swing.GroupLayout(panelConstruct);
        panelConstruct.setLayout(panelConstructLayout);
        panelConstructLayout.setHorizontalGroup(
            panelConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConstructLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDeleteEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAddVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAddEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConstructLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelDeleteVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConstructLayout.createSequentialGroup()
                        .addGroup(panelConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddV)
                            .addComponent(lblAddE)
                            .addComponent(lblDeleteV)
                            .addComponent(lblDeleteE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelConstructLayout.setVerticalGroup(
            panelConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConstructLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAddVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblAddE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAddEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeleteV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDeleteVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeleteE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDeleteEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tpanelFunction.addTab("Construct", panelConstruct);

        btnRun.setLabel("Run");
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        lblRunStatus.setText("Run Status");

        javax.swing.GroupLayout panelRunLayout = new javax.swing.GroupLayout(panelRun);
        panelRun.setLayout(panelRunLayout);
        panelRunLayout.setHorizontalGroup(
            panelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRunLayout.createSequentialGroup()
                        .addComponent(lblRunStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(btnRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRunLayout.setVerticalGroup(
            panelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRun)
                .addGap(18, 18, 18)
                .addComponent(lblRunStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        tpanelFunction.addTab("Run", panelRun);

        txtLog.setColumns(20);
        txtLog.setRows(5);
        scrLog.setViewportView(txtLog);

        javax.swing.GroupLayout panelLogLayout = new javax.swing.GroupLayout(panelLog);
        panelLog.setLayout(panelLogLayout);
        panelLogLayout.setHorizontalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrLog, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLogLayout.setVerticalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrLog, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpanelFunction.addTab("Log", panelLog);

        mnFile.setText("File");

        mnLoad.setText("Load");
        mnLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLoadMouseClicked(evt);
            }
        });
        mnFile.add(mnLoad);

        mnSave.setText("Save");
        mnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSaveMouseClicked(evt);
            }
        });
        mnFile.add(mnSave);
        mnFile.add(separator1);

        mnExit.setText("Exit");
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
        });
        mnFile.add(mnExit);

        menuBar.add(mnFile);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStepNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpanelFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpanelFunction)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelStepNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tpanelFunction.getAccessibleContext().setAccessibleName("Run");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddVertexMouseClicked
        // TODO add your handling code here:
        String name = txtNameAddV.getText();
    }//GEN-LAST:event_btnAddVertexMouseClicked

    private void btnAddEdgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEdgeMouseClicked
        // TODO add your handling code here:
        String from = txtFromAddE.getText();
        String to = txtToAddE.getText();
        try {
            int capacity = Integer.parseInt(txtCapacityAddE.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Capacity must be a number");
            return;
        }
    }//GEN-LAST:event_btnAddEdgeMouseClicked

    private void btnDeleteVertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteVertexMouseClicked
        // TODO add your handling code here:
        String name = txtNameDeleteV.getText();
    }//GEN-LAST:event_btnDeleteVertexMouseClicked

    private void btnDeleteEdgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEdgeMouseClicked
        // TODO add your handling code here:
        String id = txtIdDeleteE.getText();
    }//GEN-LAST:event_btnDeleteEdgeMouseClicked

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRunMouseClicked

    private void btnPrevStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevStepMouseClicked
        
    }//GEN-LAST:event_btnPrevStepMouseClicked

    private void btnNextStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextStepMouseClicked
        
    }//GEN-LAST:event_btnNextStepMouseClicked

    private void mnLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLoadMouseClicked
        
    }//GEN-LAST:event_mnLoadMouseClicked

    private void mnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSaveMouseClicked
        
    }//GEN-LAST:event_mnSaveMouseClicked

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_mnExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEdge;
    private javax.swing.JButton btnAddVertex;
    private javax.swing.JButton btnDeleteEdge;
    private javax.swing.JButton btnDeleteVertex;
    private javax.swing.JButton btnNextStep;
    private javax.swing.JButton btnPrevStep;
    private javax.swing.JButton btnRun;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JLabel lblAddE;
    private javax.swing.JLabel lblAddV;
    private javax.swing.JLabel lblCapacityAddE;
    private javax.swing.JLabel lblDeleteE;
    private javax.swing.JLabel lblDeleteV;
    private javax.swing.JLabel lblFromAddE;
    private javax.swing.JLabel lblIdDeleteE;
    private javax.swing.JLabel lblNameAddV;
    private javax.swing.JLabel lblNameDeleteV;
    private javax.swing.JLabel lblRunStatus;
    private javax.swing.JLabel lblStep;
    private javax.swing.JLabel lblToAddE;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnLoad;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JPanel panelAddEdge;
    private javax.swing.JPanel panelAddVertex;
    private javax.swing.JPanel panelConstruct;
    private javax.swing.JPanel panelDeleteEdge;
    private javax.swing.JPanel panelDeleteVertex;
    private javax.swing.JPanel panelLog;
    private javax.swing.JPanel panelRun;
    private javax.swing.JPanel panelStepNav;
    private javax.swing.JScrollPane scrLog;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JTabbedPane tpanelFunction;
    private javax.swing.JTextField txtCapacityAddE;
    private javax.swing.JTextField txtFromAddE;
    private javax.swing.JTextField txtIdDeleteE;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtNameAddV;
    private javax.swing.JTextField txtNameDeleteV;
    private javax.swing.JTextField txtToAddE;
    // End of variables declaration//GEN-END:variables
}

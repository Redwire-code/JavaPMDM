/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Onion
 */
public class aboutOfPanel extends javax.swing.JPanel {

    /**
     * Creates new form aboutOfPanel
     */
    public aboutOfPanel() {
        initComponents();
        
        setBackground(panelBackground);
    }
    
    Color panelBackground = new java.awt.Color(46,70,120);
    Color textFieldBackground = new java.awt.Color(129,143,173);
    Color buttonBackground = new java.awt.Color(80, 112, 170);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelParagraph = new javax.swing.JLabel();
        labelParagraph2 = new javax.swing.JLabel();
        labelParagraph3 = new javax.swing.JLabel();
        labelParagraph4 = new javax.swing.JLabel();
        labelParagraph5 = new javax.swing.JLabel();
        labelParagrap8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(720, 560));

        labelParagraph.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        labelParagraph.setForeground(new java.awt.Color(236, 243, 246));
        labelParagraph.setText("This application was developed on NetBeans 12.3.");

        labelParagraph2.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        labelParagraph2.setForeground(new java.awt.Color(236, 243, 246));
        labelParagraph2.setText("About Of");

        labelParagraph3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        labelParagraph3.setForeground(new java.awt.Color(236, 243, 246));
        labelParagraph3.setText("The database used on this application was derby");

        labelParagraph4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        labelParagraph4.setForeground(new java.awt.Color(236, 243, 246));
        labelParagraph4.setText("If you want to contact me, you can send me an e-mail ");

        labelParagraph5.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        labelParagraph5.setForeground(new java.awt.Color(236, 243, 246));
        labelParagraph5.setText("acargar1002@g.educaand.es");

        labelParagrap8.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        labelParagrap8.setForeground(new java.awt.Color(236, 243, 246));
        labelParagrap8.setText("at the following e-mail address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelParagrap8)
                        .addGap(55, 55, 55)
                        .addComponent(labelParagraph5)
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelParagraph)
                            .addComponent(labelParagraph3)
                            .addComponent(labelParagraph2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelParagraph4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelParagraph2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelParagraph)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelParagraph3)
                .addGap(50, 50, 50)
                .addComponent(labelParagraph4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelParagrap8)
                    .addComponent(labelParagraph5))
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void openBrowser() {
        try {
            URL url = new URL("https://github.com/Redwire-code");
            try {
                try {
                    Desktop.getDesktop().browse(url.toURI());
                } catch (IOException ex) {
                    Logger.getLogger(aboutOfPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (URISyntaxException ex) {
            }
        } catch (MalformedURLException ex) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelParagrap8;
    private javax.swing.JLabel labelParagraph;
    private javax.swing.JLabel labelParagraph2;
    private javax.swing.JLabel labelParagraph3;
    private javax.swing.JLabel labelParagraph4;
    private javax.swing.JLabel labelParagraph5;
    // End of variables declaration//GEN-END:variables
}

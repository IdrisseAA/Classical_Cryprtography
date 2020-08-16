/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classical_Cryprtography;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Idrisse_Rose
 */

public class Form_0 extends javax.swing.JWindow {

    /**
     * Creates new form Form_0
     */
    
    
       JProgressBar jb;
    int i=0;
    JLabel jLabel1;
    public Form_0() {
        initComponents();
       
        jLabel1= new JLabel();
        jb=new JProgressBar(0,2000);
        
        jb.setFont(new Font("Times new Roman ",Font.BOLD,24));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Classical_Cryprtography/background home.png")));
        jLabel1.setBounds(0,0,741,280);
        jb.setBounds(0,280,382,45);
        jb.setStringPainted(true);
        jb.setBorderPainted(true);
        jb.setForeground(Color.BLACK);
        jb.setBackground(Color.BLUE);
        
        add(jb);
        add(jLabel1);
        
        setSize(380,330);
        setLayout(null);
        
        setVisible(true);
       
        setLocationRelativeTo(null);

while(i<=2000){
try {    
  jb.setValue(i);
  i=i+32;
  if(i>=2000)
  {   
          Thread.sleep(1000);
          this.setVisible(false);
          new Form_1();
     
  }
Thread.sleep(190);
}
 catch(Exception e){}
}
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

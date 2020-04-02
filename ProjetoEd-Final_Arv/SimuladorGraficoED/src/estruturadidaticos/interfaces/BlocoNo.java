/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadidaticos.interfaces;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;


public class BlocoNo extends javax.swing.JPanel {
    private ArvNo no;
    private int x;
    private int y;
    public static int NODE_SIZE = 30;
    
    public BlocoNo(ArvNo no, int x, int y) {
        initComponents();
        this.no = no;
        noValor.setText(no.getConteudo()+ "");
        this.x = x;
        this.y = y;
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        this.setForeground(Color.BLACK);
        
        this.setBackground(Color.GRAY);
        this.setOpaque(true);
        
        this.setBounds(this.x, this.y, BlocoNo.NODE_SIZE, BlocoNo.NODE_SIZE);
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noValor = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setPreferredSize(new java.awt.Dimension(50, 50));

        noValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noValor.setText("VALOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel noValor;
    // End of variables declaration//GEN-END:variables
}

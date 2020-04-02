/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadidaticos.interfaces;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.SwingConstants;


/**
 *
 * @author vivi_
 */
public class ArvoreJFrame extends javax.swing.JFrame {

    String insere, remove, busca;
    ArvBin arvore;
    ArvoreJFrame arvoreframe;
    int tamArray = 0;
    int pegaNum;
     

    public ArrayList<JLabel> lista;
    public ArrayList<Integer> buscas;
    String preord = "";
    
    public ArvoreJFrame() {
        
        buscas = new ArrayList<>();
        arvore = new ArvBin();
        lista = new ArrayList<>();
        //pre_ordem = new ArrayList<>();
        
      
        initComponents();
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        preOrdem = new javax.swing.JButton();
        posOrdem = new javax.swing.JButton();
        inOrdem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        JanelaPrincipal1 = new javax.swing.JMenuItem();
        Reiniciar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Inserir1 = new javax.swing.JMenuItem();
        Find = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        preOrdem.setText("Pré-ordem");
        preOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preOrdemActionPerformed(evt);
            }
        });

        posOrdem.setText("Pós-ordem");
        posOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posOrdemActionPerformed(evt);
            }
        });

        inOrdem.setText("In-ordem");
        inOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inOrdemActionPerformed(evt);
            }
        });

        jMenu2.setText("Menu");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        JanelaPrincipal1.setText("Janela Principal");
        JanelaPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JanelaPrincipal1ActionPerformed(evt);
            }
        });
        jMenu2.add(JanelaPrincipal1);

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        jMenu2.add(Reiniciar);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Funções");

        Inserir1.setText("Inserir");
        Inserir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserir1ActionPerformed(evt);
            }
        });
        jMenu5.add(Inserir1);

        Find.setText("Busca");
        Find.setToolTipText("");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });
        jMenu5.add(Find);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(preOrdem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posOrdem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inOrdem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(preOrdem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(posOrdem)
                .addGap(11, 11, 11)
                .addComponent(inOrdem)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JanelaPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JanelaPrincipal1ActionPerformed
        GUI framegui = new GUI();
        framegui.setVisible(true);
        framegui.setTitle("Simulador de ED");
        dispose();

    }//GEN-LAST:event_JanelaPrincipal1ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        arvoreframe = new ArvoreJFrame();
        arvoreframe.setVisible(true);
        arvoreframe.setTitle("Arvores");
        dispose();
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void Inserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserir1ActionPerformed
        insere = JOptionPane.showInputDialog("Insira um elemento.");
        
        if(!isNumber(insere)) {
            JOptionPane.showMessageDialog(null, "Numero inválido");
        }else{
                int insere2 = Integer.parseInt(insere);
                arvore.inserir(insere2);
                 buscas.add(insere2);
        }
     
    }//GEN-LAST:event_Inserir1ActionPerformed

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        
        if(buscas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }else{    
            busca = JOptionPane.showInputDialog("Pequise um elemento.");
            if(!isNumber(busca) ) {
                JOptionPane.showMessageDialog(null, "Numero invalido");
            }
            boolean teste = pesquisa();
            if(teste == true){
                   JOptionPane.showMessageDialog(null, "Número encontrado: " + pegaNum);
            }
            if(teste == false){
                   JOptionPane.showMessageDialog(null, "Número não existe na lista");
            }
        }
        
    }//GEN-LAST:event_FindActionPerformed

    private void preOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preOrdemActionPerformed
        arvore.preOrdem();

    }//GEN-LAST:event_preOrdemActionPerformed

    private void posOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posOrdemActionPerformed
        arvore.posOrdem();
    }//GEN-LAST:event_posOrdemActionPerformed

    private void inOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inOrdemActionPerformed
        arvore.inOrdem();
    }//GEN-LAST:event_inOrdemActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed
    
   public boolean pesquisa(){
        int elemento = Integer.parseInt(busca);
        
        for(int j = 0; j < buscas.size(); j++) {
                
            if(buscas.get(j) == elemento){
                
                pegaNum = buscas.get(j);
                
                //pegaPos = lista2.indexOf(j);
                return true;
            }
        } 
        return false;
    }
     
    private boolean isNumber(String campo){           
            return campo.matches("[0-9]+");   
    }
   
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
            java.util.logging.Logger.getLogger(ArvoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArvoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArvoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArvoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArvoreJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Find;
    private javax.swing.JMenuItem Inserir1;
    private javax.swing.JMenuItem JanelaPrincipal1;
    private javax.swing.JMenuItem Reiniciar;
    private javax.swing.JButton inOrdem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton posOrdem;
    private javax.swing.JButton preOrdem;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadidaticos.interfaces;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Viviane Cristine 
 */
public class PilhaJFrame extends javax.swing.JFrame {
    
    int pos = 0;
    public ArrayList<JLabel> lista;
    String n_insere, pesquisa;
    String posicao_insere;
    int qntdele = 0;
    int topo = 0;
    public ArrayList<Integer> lista2;
    public ArrayList<JLabel> lista3;
    int contremov = 0;
    int contadd = 0;

    /**
     * Creates new form PilhaJFrame
     */
    public PilhaJFrame() {
        initComponents();
        lista = new ArrayList<>();
        lista2 = new ArrayList<>();
        lista3 = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        JanelaPrincipal = new javax.swing.JMenuItem();
        Reiniciar1 = new javax.swing.JMenuItem();
        BuscaPilha = new javax.swing.JMenu();
        Inserir1 = new javax.swing.JMenuItem();
        Remover = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu4.setText("Menu");

        JanelaPrincipal.setText("Janela Principal");
        JanelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JanelaPrincipalActionPerformed(evt);
            }
        });
        jMenu4.add(JanelaPrincipal);

        Reiniciar1.setText("Reiniciar");
        Reiniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reiniciar1ActionPerformed(evt);
            }
        });
        jMenu4.add(Reiniciar1);

        jMenuBar2.add(jMenu4);

        BuscaPilha.setText("Funções");

        Inserir1.setText("Empilhar");
        Inserir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserir1ActionPerformed(evt);
            }
        });
        BuscaPilha.add(Inserir1);

        Remover.setText("Desempilhar");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        BuscaPilha.add(Remover);

        jMenuItem1.setText("Mostrar o topo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        BuscaPilha.add(jMenuItem1);

        jMenuBar2.add(BuscaPilha);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1278, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JanelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JanelaPrincipalActionPerformed
        GUI framegui = new GUI();
        framegui.setVisible(true);
        framegui.setTitle("Simulador Gráfico de Estruturas de dados");
        framegui.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_JanelaPrincipalActionPerformed

    private void Reiniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reiniciar1ActionPerformed
        PilhaJFrame pilaframe = new PilhaJFrame();
        pilaframe.setVisible(true);
        pilaframe.setTitle("Pilhas");
        dispose();
    }//GEN-LAST:event_Reiniciar1ActionPerformed

    private void Inserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserir1ActionPerformed
        n_insere = JOptionPane.showInputDialog("Insira um elemento.");

        if(!isNumber(n_insere)) {
            JOptionPane.showMessageDialog(null, "Numero invalido");
        }else{
            adicionaLabel();
            qntdele++;
            int s = Integer.parseInt(n_insere);
            lista2.add(s);
        }
       
    }//GEN-LAST:event_Inserir1ActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
      if(lista2.isEmpty()){
            JOptionPane.showMessageDialog(null, "A pilha está vazia");
        }else{
            removeJlabelPilha();
            qntdele--;
            lista2.remove(lista2.size()-1);
      }
       
  
    }//GEN-LAST:event_RemoverActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        if(lista2.isEmpty()){
             JOptionPane.showMessageDialog(null, "A pilha está vazia");
        }else{
             topo = lista2.get(lista2.size() - 1);
             JOptionPane.showMessageDialog(null, "O topo da pilha é:  " + topo);
        }
       
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private boolean isNumber(String campo){           
            return campo.matches("[0-9]+");   
    }
    
    private void adicionaLabel(){
  
            JLabel l = new JLabel("" + n_insere);
            l.setBounds(70,500-50*qntdele,150,50);
            l.setBorder(BorderFactory.createLineBorder(Color.black));
            l.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
            l.setForeground(Color.BLACK);
            l.setHorizontalAlignment(SwingConstants.CENTER);
            l.setBackground(Color.gray);
            l.setOpaque(true);

            getContentPane().add(l);
            lista.add(l);
            initComponents();
       
    }
     
    private void removeJlabelPilha(){
         lista.get(lista.size()-1).setVisible(false);
         lista.remove(lista.size()-1);
         
    }
    
   /* private boolean getTopo(){
        
        if(contadd != 0 || contremov != 0);
            topo = lista2.get(lista2.size() - 1);
            System.out.println("o topo é" + topo);
            return true;
    }
    
    private void topo(){
        
           
            
           
            JLabel t = new JLabel("" + topo);
            boolean i = getTopo();
            if(i == true){
                 t.setName("" + topo);
            }
           
            t.setBounds(400,70,70,70);
            //t.setLocation(70,70);
            t.setBorder(BorderFactory.createLineBorder(Color.black));
            t.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
            t.setForeground(Color.BLACK);
            t.setHorizontalAlignment(SwingConstants.CENTER);
            t.setBackground(Color.WHITE);
            t.setOpaque(true);
            
            getContentPane().add(t);
            lista3.add(t);
            initComponents();
                
    }*/

         
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
            java.util.logging.Logger.getLogger(PilhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PilhaJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BuscaPilha;
    private javax.swing.JMenuItem Inserir1;
    private javax.swing.JMenuItem JanelaPrincipal;
    private javax.swing.JMenuItem Reiniciar1;
    private javax.swing.JMenuItem Remover;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}

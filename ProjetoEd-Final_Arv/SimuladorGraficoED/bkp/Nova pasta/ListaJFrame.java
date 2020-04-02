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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Viviane Cristine 
 */



public class ListaJFrame extends javax.swing.JFrame {
    
    public ArrayList<JLabel> lista;
    String n_insere, n_remove, procura, busca_indice;
    String posicao_insere;
    final int posInicial;
    int tamArray = 0;
    public ArrayList<Integer> lista2;
    int pegaNum;
    int pegaPos = 0;
    public ArrayList<JLabel> listaSetas;
    public ArrayList<Integer> lista3;
    public int numero_bscind;

    
    /**
     * Creates new form ListaJFrame
     */
    public ListaJFrame() {
        initComponents();
        lista = new ArrayList<>();
        posInicial = 20;
        lista2 = new ArrayList<>();
        listaSetas = new ArrayList<>();
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

        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        JanelaPrincipal = new javax.swing.JMenuItem();
        Reiniciar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Inserir = new javax.swing.JMenuItem();
        Remover = new javax.swing.JMenuItem();
        Find = new javax.swing.JMenuItem();
        BuscaIndex = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jMenu2.setText("Menu");

        JanelaPrincipal.setText("Janela Principal");
        JanelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JanelaPrincipalActionPerformed(evt);
            }
        });
        jMenu2.add(JanelaPrincipal);

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        jMenu2.add(Reiniciar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Funções");

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });
        jMenu1.add(Inserir);

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        jMenu1.add(Remover);

        Find.setText("Busca por elemento");
        Find.setToolTipText("");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });
        jMenu1.add(Find);

        BuscaIndex.setText("Busca por Index ");
        BuscaIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaIndexActionPerformed(evt);
            }
        });
        jMenu1.add(BuscaIndex);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1347, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
  
    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        ListaJFrame listaframe = new ListaJFrame();
        listaframe.setVisible(true);
        listaframe.setTitle("Listas Encadeadas");
        dispose();
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void JanelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JanelaPrincipalActionPerformed
        GUI framegui = new GUI();
        framegui.setVisible(true);
        framegui.setTitle("Simulador Gráfico de Estruturas de dados");
        framegui.setLocationRelativeTo(null);        
        dispose();
        
    }//GEN-LAST:event_JanelaPrincipalActionPerformed
    
    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        
        n_insere = JOptionPane.showInputDialog("Insira um elemento.");
       
        if(!isNumber(n_insere)) {
            JOptionPane.showMessageDialog(null, "Numero inválido");

        }else{
            posicao_insere = JOptionPane.showInputDialog("Insira a posicao.");
            if(!isNumber(posicao_insere)) {
                JOptionPane.showMessageDialog(null, "Posição inválida");
            }  
            int s = Integer.parseInt(n_insere);
            int pos = Integer.parseInt(posicao_insere);
            if(Integer.parseInt(posicao_insere) == tamArray) {
                adicionaLabelFinal();
                adicionaSetaLabel();
                lista2.add(s);
                lista3.add(0);
                lista3.add(tamArray);
                tamArray++;
            } else if(Integer.parseInt(posicao_insere) < tamArray){
                adicionaLabel();
                adicionaSetaLabel();
                lista2.add(pos,s);
                lista3.add(0);
                lista3.add(tamArray);
                tamArray++;
              
              
            }  else{
                    JOptionPane.showMessageDialog(null, "Posição inválida");
              
            }      
            
        }
           
    }//GEN-LAST:event_InserirActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        if(lista2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }else{
            n_remove = JOptionPane.showInputDialog("Insira o indice a ser removido");

            if(!isNumber(n_remove)) {
                JOptionPane.showMessageDialog(null, "Posicao invalida");

            }
            int i = Integer.parseInt(n_remove);
            if(i > lista.size()-1) {
                JOptionPane.showMessageDialog(null, "Voce digitou um indice maior que o esperado");
                return;
            }
            removerIndice(Integer.parseInt(n_remove));
            removerSeta(Integer.parseInt(n_remove));
            tamArray--;
            int s = Integer.parseInt(n_remove);
            lista2.remove(s);
        }
        
    }//GEN-LAST:event_RemoverActionPerformed

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        if(lista2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }else{    
            procura = JOptionPane.showInputDialog("Pequise um elemento.");
            if(!isNumber(procura) ) {
                JOptionPane.showMessageDialog(null, "Numero invalido");
            }
            boolean teste = pesquisa();
            if(teste == true){
                   JOptionPane.showMessageDialog(null, "Número encontrado: " + pegaNum + "  na posição: " + lista2.indexOf(pegaNum));
            }
            if(teste == false){
                   JOptionPane.showMessageDialog(null, "Número não existe na lista");
            }
        }
    }//GEN-LAST:event_FindActionPerformed

    private void BuscaIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaIndexActionPerformed
        if(lista2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }else{
        busca_indice = JOptionPane.showInputDialog("Digite um indice. ");
            if(!isNumber(busca_indice) ) {
                JOptionPane.showMessageDialog(null, "Numero invalido");
            }
            boolean teste = pesquisaIndice();

            if(teste == true){
                   JOptionPane.showMessageDialog(null, "Na posicao " + busca_indice + " existe o elemento: " + numero_bscind);
            }
            if(teste == false){
                   JOptionPane.showMessageDialog(null, "Indice nao alocado");
            }
        }
    }//GEN-LAST:event_BuscaIndexActionPerformed
   
    
    
    public boolean pesquisa(){
        int elemento = Integer.parseInt(procura);
        
        for(int j = 0; j < lista2.size(); j++) {
                
            if(lista2.get(j) == elemento){
                
                pegaNum = lista2.get(j);
                
                //pegaPos = lista2.indexOf(j);
                return true;
            }
        } 
        return false;
    }
    
    public boolean pesquisaIndice(){
        int indice = Integer.parseInt(busca_indice);
        for(int j = 0; j < lista3.size(); j++) {
                
            if(lista3.get(j) == indice){
                numero_bscind = lista2.get(indice);
                //pegaNum = lista2.get(j);
                //pegaPos = lista2.indexOf(j);
                return true;
            }
        } 
        return false;
    }
   
    private void removerIndice(int i) {
        lista.get(i).setVisible(false);
        lista.remove(i);
        
        //Esse eh um algoritmo pra reorganizar a lista
        for(int j = 0; j < lista.size(); j++) {
                
            lista.get(j).setBounds(posInicial + (120 * j), 50, 70, 70);
           
        }
        
    }

    private boolean isNumber(String campo){           
            return campo.matches("[0-9]+");   
    }
    
   
    
     private void adicionaLabelFinal(){
         
        JLabel l = new JLabel("" + n_insere);
        l.setBounds(20 + (120*Integer.parseInt(posicao_insere)), 50, 70, 70);
        l.setBorder(BorderFactory.createLineBorder(Color.black));
        l.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setBackground(Color.GRAY);
        l.setOpaque(true);
        lista.add(l);
        getContentPane().add(l);
        initComponents();
     }
     private void adicionaLabel(){
        JLabel l = new JLabel();
        l.setBounds(20 + (120*lista.size()), 50, 70, 70);
        l.setBorder(BorderFactory.createLineBorder(Color.black));
        l.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setBackground(Color.GRAY);
        l.setOpaque(true);
        lista.add(l);
        for(int i = lista.size()-1; i > Integer.parseInt(posicao_insere); i--){
            String nAnterior = lista.get(i-1).getText();
            lista.get(i).setText(nAnterior);
        }
        lista.get(Integer.parseInt(posicao_insere)).setText(n_insere);
        
        getContentPane().add(l);
        initComponents();
     }
     
      private void removerSeta(int i) {
      if ("0".equals(i)){ 
            listaSetas.get(0).setVisible(false);
            listaSetas.remove(0);
            listaSetas.get(1).setVisible(false);
            listaSetas.remove(1);
        } else {
            listaSetas.get(i).setVisible(false);
            listaSetas.remove(i);
        }

        //Esse eh um algoritmo pra reorganizar a lista 
        for(int j = 0; j < listaSetas.size(); j++) {
            listaSetas.get(j).setBounds((-30+(120*j)), 50, 55, 70);
            listaSetas.get(0).setVisible(false);
        }
        
        
    }
      
  private void adicionaSetaLabel(){
            
           
        if(lista.size()!=1){
            ImageIcon seta = new ImageIcon(getClass().getResource("setatrans.png"));
            JLabel setaLabel2 = new JLabel(seta);
            setaLabel2.setBounds(-33+(120*(tamArray)), 50, 55, 70);
            
            add(setaLabel2);
            listaSetas.add(setaLabel2);
            getContentPane().add(setaLabel2);
        } else {
            ImageIcon seta = new ImageIcon(getClass().getResource("setatrans.png"));
            JLabel setaLabel2 = new JLabel(seta);
            setaLabel2.setBounds(-33+(120*Integer.parseInt(posicao_insere)+1), 50, 55, 70);
            setaLabel2.setVisible(false);
            add(setaLabel2);
            listaSetas.add(setaLabel2);
            getContentPane().add(setaLabel2);
        }
            
          initComponents();
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
            java.util.logging.Logger.getLogger(ListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         /*Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaJFrame().setVisible(true);
            }
        });
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscaIndex;
    private javax.swing.JMenuItem Find;
    public javax.swing.JMenuItem Inserir;
    private javax.swing.JMenuItem JanelaPrincipal;
    private javax.swing.JMenuItem Reiniciar;
    private javax.swing.JMenuItem Remover;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    
}
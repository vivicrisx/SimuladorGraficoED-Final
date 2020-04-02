/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadidaticos.interfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vivi_
 */
public class ArvBin {
    public ArrayList<Integer> pre_ordem;
    private No raiz;
    
    //int[] preordem2 = new int[tamArray];
    
    
    public ArvBin(){
        this.setRaiz(raiz);
        pre_ordem = new ArrayList<>();
    }
    
  
    public No getRaiz(){
       return raiz;
   }
   
   public void setRaiz(No raiz){
       this.raiz = raiz;
   }
     //metodo inserir
    public void inserir(No node, int valor_inserido){
        
        if(node == null){
            node.setValor(valor_inserido);
        }else{
            if( valor_inserido < node.getValor()) {
                if(node.getEsq() == null){
                    No novo = new No(valor_inserido);
                    node.setEsq(novo);
                }else{
                    inserir(node.getEsq(), valor_inserido);
                }
            }else{
               
                if(node.getDir() == null){
                    No novo = new No(valor_inserido);
                    node.setDir(novo);
                }else{
                    inserir(node.getDir(), valor_inserido);
                }     
            }
        }
    }
    
    public void inserir(int valor){
        if(this.getRaiz() == null){
            this.raiz = new No(valor);
        }else{
            inserir(this.raiz, valor);
        }
    }
  
    //metodo prefixado ou pre ordem
    public void preOrdem(No node){
        if(node == null)
            return;
        
        JOptionPane.showMessageDialog(null, node.getValor());
        if(node.getEsq() != null)  
            preOrdem(node.getEsq());
        
        if(node.getDir() != null)
            preOrdem(node.getDir());
        
        
        
    }
    
    public String preOrdem() {
        if (raiz == null)
            JOptionPane.showMessageDialog(null, "Árvore vazia");
        else
            preOrdem(raiz);
         return null;
    }	
    
    public void posOrdem(No node){
        if(node == null)
            return;
            
        if(node.getEsq() != null)  
            posOrdem(node.getEsq());
        
        if(node.getDir() != null)
            posOrdem(node.getDir());
        
        JOptionPane.showMessageDialog(null, node.getValor());
        
    }
    
    public void posOrdem() {
            if (raiz == null)
                 JOptionPane.showMessageDialog(null, "Árvore vazia");
            else
                    posOrdem(raiz);
    }
    
    public void inOrdem(No node){
        if(node == null)
             return;
            
        if(node.getEsq() != null)  
            inOrdem(node.getEsq());
        
        JOptionPane.showMessageDialog(null, node.getValor());
        
        if(node.getDir() != null)
            inOrdem(node.getDir());
          
    }
      
    public void inOrdem() {
            if (raiz == null)
                    JOptionPane.showMessageDialog(null, "Árvore vazia");
            else
                    inOrdem(raiz);
    }
    
}

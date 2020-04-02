/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadidaticos.interfaces;

/**
 *
 * @author vivi_
 */


public class No {
	private int valor;
	private No esq;
	private No dir;
	
	public No(int valor){
		this.valor = valor;
	}
	public No(){
            ;
        }
	public int getValor() {
		return valor;
	}
	public void setValor(int conteudo) {
		this.valor = conteudo;
	}
	
	public No getEsq() {
		return esq;
	}
	public void setEsq(No esq) {
		this.esq = esq;
	}
	
	public No getDir() {
		return dir;
	}
	
	public void setDir(No dir) {
		this.dir = dir;
	}
}

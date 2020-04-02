/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadidaticos.interfaces;


public class ArvNo {

    private int conteudo;
    private ArvNo esq;
    private ArvNo dir;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    private int y;

    public ArvNo(int x, int y) {
        this.esq = null;
        this.dir = null;
        this.conteudo = -1;
        this.x = x;
        this.y = y;
    }

    public int getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public ArvNo getEsq() {
        return this.esq;
    }

    public void setEsq(ArvNo esq) {
        this.esq = esq;
    }

    public ArvNo getDir() {
        return this.dir;
    }

    public void setDir(ArvNo dir) {
        this.dir = dir;
    }
}

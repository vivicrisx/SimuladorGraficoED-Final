
package estruturadidaticos.interfaces;

import java.awt.*;
import javax.swing.*;


public class ArvPro {

    public ArvNo raiz;
    public JPanel panel;
    public int x;
    public int y;
    public int nElementos;
    public double xOffset = 10;
    public double yOffset = 0.5;
    public int lastDE;
    public Graphics2D g;

    public void setGraphics(Graphics g) {
        this.g = (Graphics2D) g;
    }

    public ArvPro(JPanel panel) {
        this.raiz = null;
        this.panel = panel;
        this.nElementos = 0;
        this.lastDE = 0;
        this.g = null;
        resetCord();
    }

    public void resetCord() {
        this.x = (int) (this.panel.getWidth() / 2);
        this.y = 10;
    }

    public boolean vazia() {
        return this.raiz == null;
    }

    private ArvNo busca(ArvNo T, int valor) {
        if (T == null) {
            return null;
        }

        if (T.getConteudo() == valor) {
            return T;
        }

        if (valor < T.getConteudo()) {
            return busca(T.getEsq(), valor);
        } else {
            return busca(T.getDir(), valor);
        }

    }

    public ArvNo busca(int valor) {
        if (raiz != null) {
            return busca(raiz, valor);
        }
        return null;
    }

    public boolean insere(int valor) {
        ArvNo novoNo = new ArvNo(this.x, this.y);
        novoNo.setConteudo(valor);
        novoNo.setEsq(null);
        novoNo.setDir(null);

        if (raiz == null) {
            raiz = novoNo;
            this.nElementos++;
            return true;
        }

        ArvNo aux = this.raiz;
        ArvNo p = null;
        int de = 1;
        while (aux != null) {

            p = aux;
            if (valor < aux.getConteudo()) {
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
            de++;
        }

        double xOffsetNode = (double) (xOffset * (double) (1.0 / de)) * BlocoNo.NODE_SIZE;

        if (valor < p.getConteudo()) {
            int x = (int) (p.getX() - xOffsetNode);
            int y = (int) (p.getY() + (yOffset * BlocoNo.NODE_SIZE * de));
            novoNo.setX(x);
            novoNo.setY(y);
            p.setEsq(novoNo);
        } else {
            int x = (int) (p.getX() + xOffsetNode);
            int y = (int) (p.getY() + (yOffset * BlocoNo.NODE_SIZE * de));
            novoNo.setX(x);
            novoNo.setY(y);
            p.setDir(novoNo);
        }

        this.nElementos++;
        return true;
    }

    public void mostrar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        resetCord();
        if (!vazia()) {
            ArvNo aux = this.raiz;
            exibe(aux, null, g2d);
        }

    }

    private void exibe(ArvNo T, ArvNo pai, Graphics2D g2d) {
        if (T != null) {
            exibe(T.getDir(), T, g2d);
            if (pai == null) {
                panel.add(new BlocoNo(T, T.getX(), T.getY()));
            } else {
                panel.add(new BlocoNo(T, T.getX(), T.getY()));
            g2d.setColor(Color.BLACK);
            g2d.drawLine(pai.getX(), pai.getY(), T.getX(), T.getY());
            }

            exibe(T.getEsq(), T, g2d);
            
        }

        panel.repaint();
        panel.revalidate();
    }

    public void showArvore() {

        resetCord();
        panel.removeAll();
        if (!vazia()) {
            ArvNo aux = this.raiz;
            exibe(aux, null, this.g);
        }

    }

}

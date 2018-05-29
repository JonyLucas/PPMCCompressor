package ppm.decoder.model;

import java.util.ArrayList;

public class PPMNode {

    private int frequency, symbol;
    private ArrayList<PPMNode> children = new ArrayList<PPMNode>();

    public PPMNode(int symbol){
        this.symbol = symbol;
        frequency = 1;
    }

    /**
     * Construtor utilizado na instanciação da raiz da árvore.
     */
    public PPMNode(){
        this(-1);
    }

    public int getSymbol(){ return this.symbol; }

    public int getFrequency(){ return this.frequency; }

    public ArrayList<PPMNode> getChildren() { return this.children; }

    public void incrementFrequency(){ this.frequency++; }

    public void addChild(int symbol) {
        children.add(new PPMNode(symbol));
    }

    /**
     * Realiza a busca (em largura) do filho do nó corrente que possua o símbolo correspondente
     * ao símbolo passado como argumento.
     * @param symbol
     * @return
     */
    public PPMNode findChild(int symbol){
        for(PPMNode child : this.children){
            if(child.getSymbol() == symbol)
                return child;
        }

        return null;
    }

}
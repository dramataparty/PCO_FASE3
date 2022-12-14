/**
 * Uma implementacao da interface Game
 *@author Diogo Forte nº 56931, Tiago Pereira nº55854, Miguel Pinto nº51600
**/

import java.util.Random;

public abstract class AbstractGame implements Game {
    


    private int r;
    private int c;
    private int diff;
    private Symbol empty;
    private Symbol[] values;
    private Accomodator acc;
    private Eliminator elim;
    private Random gen;
    private PlayArea area;
    private Piece pref;


    /**
     * Construtor da classe AbstractGame.
     * @param r
     * @param c
     * @param diff
     * @param empty
     * @param values
     * @param gen
     * @param elim
     * @param acc
     * @requires c != null, r != null, diff != null, empty != null, values != null, gen != null, elim != null, acc != null
     * @ensures Inicializacao de todas as variaveis no construtor.
     */
    public AbstractGame(int r, int c, int diff, Symbol empty, Symbol[]
    values, Random gen, Eliminator elim, Accomodator acc){
        this.r = r;
        this.c = c;
        this.diff=diff;
        this.empty=empty;
        this.values=values;
        this.acc=acc;
        this.elim = elim;
        this.gen = gen;
        this.area= new PlayArea(r, c, diff, empty, values, gen, elim, acc);
       
    }

    /**
     * Função que devolve as linhas da Grid.
     * @return As linhas da Grid
     * @ensures Devolver as linhas da Grid.
     */
    public int linesInGrid(){
        return r;
        
    }
    /**
     * Função que devolve as colunas da Grid.
     * @return As linhas da Grid
     * @ensures Devolver as linhas da Grid.
     */
    public int colsInGrid() {
        return c;
    }
    
    /**
     * Funcao que permuta uma peÁa com um valor n.
     * @param n
     * @requires n != null
     * @ensures O movimento da peca no Game, caso a variavel n seja diferente de null.
     */
    @Override
	public void permutatePiece(int n){
        
        pref.permutation(n);

    }
    /**
     * Funcao que coloca a peca na Grid/jogo.
     * @requires col != null
     * @param col
     * @ensures A introducao da peca no Game, caso a variavel col seja diferente de null.
     */
    @Override
    public void placePiece(int col) {
        area.placePiece(pref,col-1); 
        
    }	 
    /**
     * Funcao que gera uma peÁa.
     * @ensures A criacao de uma peca para o Game.
     */
    @Override
    public void generatePiece() {
        this.pref = new Piece(gen, SIZE_OF_PIECE, empty, values);
                

    }
    /**
     * Funcao booleana que verifica se alguma coluna ainda tem espaco para uma peca.
     * @return True se houver espaco para colocar uma peca ou False se nao houver espaco para colocar uma peca
     * @ensures Devolver True ou False.
     */
    public boolean finished(){
        boolean fin=!(area.hasEnoughSpace(Game.SIZE_OF_PIECE));
        return fin;
    }


    /**
     * Funcao que devolve o espaÁo numa dada coluna .
     * @param col
     * @requires col != null
     * @return o espaco na dada coluna, caso a col seja diferente de null
     * @ensures devolver um int que tem como valor o tamanho da dada coluna.
     */
    public int spaceInColumn(int col)	{            
        return this.area.spaceInColumn(col);


    } 	 
    /**
     * FunÁ„o que devolve uma representaÁ„o textual da peÁa corrente.
     * @return Uma representaÁ„o textual da peÁa atual
     * @ensures Devolver a representaÁ„o textual de uma peÁa.
     */
    public String currentPiece(){


        return pref.toString();
    }
    /**
     * FunÁ„o que devolve a representaÁ„o textual do AbstractGame.
     * @return A representaÁ„o textual do AbstractGame
     * @ensures Devolver a representaÁ„o textual do AbstractGame/jogo a decorrer.
     */
    
    public String toString(){
        

        return "Current Grid : \n " + area.currentGrid();
        /* devolve a representação textual deste jogo; */


    }

   
        

}
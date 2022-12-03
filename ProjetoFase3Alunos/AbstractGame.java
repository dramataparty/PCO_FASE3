import java.util.Random;



public abstract class AbstractGame implements Game {
    /*tem o construtor AbstractGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc)
     *  vai ter área de jogo de r(rows) por c(columns), com diff(iculty) linhas já preenchidas
     *   as linhas do diff vão estar preenchidas com símbolos escolhidos através dos values, gerados pelo gerador "gen"
     *   o jogo vai ter de usar o elim(inator) e o acc(omodator) em todas as jogadas;
     */ 
    

    private int r;
    private int c;
    private int diff;
    private Symbol empty;
    private Symbol[] values;
    private Accomadator acc;
    private Eliminator elim;
    private Random gen;



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
       
    }

    public int linesInGrid(){
        return r;
        
    }
    public int colsInGrid() {
        return c;
    }
    @Override
	void permutatePiece(int n){
        Piece pref = new Piece(gen, Game.SIZE_OF_PIECE, empty, values);
        pref.permutation(n);

    }
    @Override
    void placePiece(int col) {
        Piece pref = new Piece(gen, Game.SIZE_OF_PIECE, empty, values);
        Piece a = pref.copy();    
        
    }	 
    @Override
    void generatePiece() {


    }
    boolean finished(){
    /* devolve true se	não	existe	nenhuma	coluna	 onde ainda	caiba uma peça; */
    }
    int spaceInColumn(int col)	{


    } 	 
    String currentPiece(){

    }

    String toString(){
        /* devolve a representação textual deste jogo; */

    } 

}
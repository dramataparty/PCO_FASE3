import java.util.Random;
import java.lang.Boolean;



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
    private Accomodator acc;
    private Eliminator elim;
    private Random gen;

    private PlayArea area;



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
        this.area = new PlayArea(r, c, diff, empty, values, gen, elim,acc);
       
    }

    public int linesInGrid(){
        return r;
        
    }
    public int colsInGrid() {
        return c;
    }
    @Override
	public void permutatePiece(int n){
        Piece pref = new Piece(gen, Game.SIZE_OF_PIECE, empty, values);
        pref.permutation(n);

    }
    @Override
    public void placePiece(int col) {
        Piece pref = new Piece(gen, Game.SIZE_OF_PIECE, empty, values);
        area.placePiece(pref,col); 
        
    }	 
    @Override
    public void generatePiece() {
        Piece np = new Piece(gen, SIZE_OF_PIECE, empty, values);
                

    }
    public boolean finished(){
        boolean fin= !(area.hasEnoughSpace(Game.SIZE_OF_PIECE));
    /* devolve true se	não	existe	nenhuma	coluna	 onde ainda	caiba uma peça; */
    
        return fin;
    }
    
    public int spaceInColumn(int col)	{            
        return this.area.spaceInColumn(col);


    } 	 
    public String currentPiece(){
        Piece p = new Piece(values);
        String a = p.toString();
        return a;
    }

    public String toString(){
        return SingleScoreGame().toString();
        /* devolve a representação textual deste jogo; */


    }

}
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

    public AbstractGame(PlayArea area) {

        this.area = area;
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
        Piece a = pref.copy();    
        
    }	 
    @Override
    public void generatePiece() {
        /* Generate como? da mesma maneira q a fase 2? */
        


    }
    public boolean finished(){
        boolean fin=false;
    /* devolve true se	não	existe	nenhuma	coluna	 onde ainda	caiba uma peça; */
        for(int i=0;i<c;i++){
            int open = 0;
            for(int e=0;e<r;e++){
                if (this.area[i][e] == Symbol.EMPTY){
                    open++;
                }
                

            }
            if(open<SIZE_OF_PIECE){
                fin=true;

            }
        }
        return fin;
    }
    
    public int spaceInColumn(int col)	{  
        int open = 0;
            for(int e=0;e<r;e++){
                
                if (this.area[col][e] == Symbol.EMPTY){
                    open++;
                }
                
            }           
        return open;


    } 	 
    public String currentPiece(){
        Piece p = new Piece(values);
        String a = p.toString();
        return a;
    }

    public String toString(){
        return SingleScoreGame.toString;
        /* devolve a representação textual deste jogo; */


    } 

}
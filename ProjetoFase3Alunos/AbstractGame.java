import java.util.Random;




public abstract class AbstractGame implements Game {
    /*tem o construtor AbstractGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc)
     *  vai ter área de jogo de r(rows) por c(columns), com diff(iculty) linhas já preenchidas
     *   as linhas do diff vão estar preenchidas com símbolos escolhidos através dos values, gerados pelo gerador "gen"
     *   o jogo vai ter de usar o elim(inator) e o acc(omodator) em todas as jogadas;
     */ 


    int r;
    int c;
    int diff;
    Symbol empty;
    Symbol[] values;
    Accomodator acc;
    Eliminator elim;
    Random gen;
    PlayArea area;
    Piece pref;



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
	public void permutatePiece(int n){
        
        pref.permutation(n);

    }
    @Override
    public void placePiece(int col) {
        area.placePiece(pref,col); 
        
    }	 
    @Override
    public void generatePiece() {
        this.pref = new Piece(gen, SIZE_OF_PIECE, empty, values);
                

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


        return pref.toString();
    }

    public String toString(){
        

        return area.currentGrid();
        /* devolve a representação textual deste jogo; */


    }

   
        

}
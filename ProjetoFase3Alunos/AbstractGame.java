public abstract class AbstractGame {
    /*tem o construtor AbstractGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc)
     *  vai ter área de jogo de r(rows) por c(columns), com diff(iculty) linhas já preenchidas
     *   as linhas do diff vão estar preenchidas com símbolos escolhidos através dos values, gerados pelo gerador "gen"
     *   o jogo vai ter de usar o elim(inator) e o acc(omodator) em todas as jogadas;
     */ 
    
    int linesInGrid(){

    }
    int colsInGrid() {

    }
	void permutatePiece(int n){

    }
    void placePiece(int col) {

    }	 
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
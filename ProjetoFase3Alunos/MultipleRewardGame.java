import java.util.List;
import java.util.Random;

public class MultipleRewardGame extends AbstractGame{

    private int r;
    private int c; 
    private int diff; 
    private Symbol empty; 
    private Symbol[] values; 
    private Random gen; 
    private Eliminator elim; 
    private Accomodator acc;

    /*
     * instancias desta subclasse representam jogos, cuja pontuação é calculada da mesma maneira q na fase 2
     * jogos terminam se n existir coluna em q caiba alguma peça
     * 
     */
    public MultipleRewardGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc){
    /*
     * inicializa nosso objeto "jogo"
     */

    super(r, c, diff, empty, values, gen, elim, acc);

    }
    public int score;
    @Override
    public void registerPlayScore(List<Integer> eliminated){
        
        /* Atualiza a pontuação do jogo com os resultados de uma jogada
         * a lista eleminated vai conter o nº de simbolos que foram eleminados em varias fases da jogada
         * pontuação igual à fase2
         */
        for(int i =0; i<eliminated.size();i++){
            if(eliminated.get(i)>=3){
                score += 200;
                int expoints = (Game.SIZE_OF_PIECE - eliminated.get(i)) *50 ;
                score  += expoints;

            }

        }
    
    }

    @Override
    public int score() {
        
        return score;
        /* devolve a pontuação atual do jogo */
    }
    @Override
    public String toString() {
        
        /* representação textual deste jogo, com o score */
        return "Score: " + score()  +  super.toString();
    }
}

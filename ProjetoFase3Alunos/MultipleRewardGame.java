/**
 * RepresentaÁ„o de uma extens„o da classe AbstractGame
 *@author Diogo Forte n∫ 56931, Tiago Pereira n∫55854, Miguel Pinto n∫51600
 */
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

    /**
     * Construtor da classe MultipleRewardGame.
     * @param r
     * @param c
     * @param diff
     * @param empty
     * @param values
     * @param gen
     * @param elim
     * @param acc
     * @requires r != null, c != null, diff != null, empty != null, values != null, gen != null, elim != null, acc != null
     * @ensures InicializaÁ„o de todas as vari·veis no construtor.
     */    
    public MultipleRewardGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc){
    

    super(r, c, diff, empty, values, gen, elim, acc);

    }
    /**
     * FunÁ„o que atualiza a pontuaÁ„o dos jogos com os resultados de uma jogada.
     * @param eliminated
     * @requires eliminated != null
     * @ensures Atualizar a pontuaÁ„o dos jogos.
     */
    public int score;
    @Override
    public void registerPlayScore(List<Integer> eliminated){
        
        
        for(int i =0; i<eliminated.size();i++){
            if(eliminated.get(i)>=3){
                score += 200;
                int expoints = (Game.SIZE_OF_PIECE - eliminated.get(i)) *50 ;
                score  += expoints;

            }

        }
    
    }
    /**
     * FunÁ„o que devolve a pontuaÁ„o atual do jogo.
     * @return pontuaÁ„o atual do jogo
     * @ensures Devolver um valor int guardado com a pontuaÁ„o atual do jogo.
     */
    @Override
    public int score() {
        
        return score;
        
    }
    /**
     * FunÁ„o que devolve a representaÁ„o textual do MultipleRewardGame.
     * @return A representaÁ„o textual do MultipleRewardGame
     * @ensures Devolver a representaÁ„o textual do MultipleRewardGame/jogo a decorrer.
     */
    @Override
    public String toString() {
        
        
        return "Score: " + score() + "\n"  +  super.toString();
    }
}

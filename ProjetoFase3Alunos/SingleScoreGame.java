/**
 * RepresentaÁ„o de uma extens„o da classe AbstractGame
 *@author Diogo Forte n∫ 56931, Tiago Pereira n∫55854, Miguel Pinto n∫51600
 */
import java.util.List;
import java.util.Random;

public class SingleScoreGame extends AbstractGame{
    
    private int score;
    /**
     * Construtor da classe SingleScoreGame.
     * @param r
     * @param c
     * @param diff
     * @param empty
     * @param values
     * @param gen
     * @param elim
     * @param acc
     * @ensures InicializaÁ„o de todas as vari·veis no construtor.
     */    
    public SingleScoreGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc){
       
    
        super(r, c, diff, empty, values, gen, elim, acc);
    
        }


    /**
     * FunÁ„o que atualiza a pontuaÁ„o dos jogos com os resultados de uma jogada.
     * @param eliminated
     * @requires eliminated != null
     * @ensures Atualizar a pontuaÁ„o dos jogos.
     */
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
    public int score() {
        
        return score;
    }

    

    
    /**
     * FunÁ„o booleana que verifica se alguma coluna ainda tem espaÁo para uma peÁa.
     * @return True se houver espaÁo para colocar uma peÁa ou False se n„o houver espaÁo para colocar uma peÁa
     * @ensures Devolver True ou False.
     */
    @Override
    public boolean finished(){
        
        
        return super.finished();
       
    } 
    /**
     * FunÁ„o que devolve a representaÁ„o textual do SingleScoreGame.
     * @return A representaÁ„o textual do SingleScoreGame
     * @ensures Devolver a representaÁ„o textual do SingleScoreGame/jogo a decorrer.
     */
    public String toString(){

    return super.toString();
    } 
}
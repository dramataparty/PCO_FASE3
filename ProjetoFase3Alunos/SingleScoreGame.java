import java.util.List;
import java.util.Random;

public class SingleScoreGame extends AbstractGame{
    /*
     * instancias representam, cuja pontuação só contabiliza a realização das jogadas, (NÃO CONTAM ELMINAÇÕES )
     * só terminam quando a àrea do jogo está copletamente vazia
     */
    private int score;

    public SingleScoreGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc){
        /*
         * inicializa nosso objeto "jogo"
         */
    
        super(r, c, diff, empty, values, gen, elim, acc);
    
        }



    public void registerPlayScore(List<Integer> eliminated){
        /* Atualiza a pontuação do jogo com os resultados de uma jogada
         * a lista eleminated vai conter o nº de simbolos que foram eleminados em varias fases da jogada
         * a pontuação é calculada contabilizando somente a realização	das	jogadas	(não	conta	com	eliminações	feitas);
         */
        for(int i =0; i<eliminated.size();i++){
            if(eliminated.get(i)>=3){
                score += 200;
                int expoints = (Game.SIZE_OF_PIECE - eliminated.get(i)) *50 ;
                score  += expoints;

            }

        }

    }

    public int score() {
        /* devolve a pontuação atual do jogo */
        return score;
    }

    

    
    

    public boolean finished(){
        
        boolean infin = this.area.hasEnoughSpace(SIZE_OF_PIECE);
        boolean fin = !(infin);
        return fin;
        /*que	devolve	true se	a	área	de	jogo	está	completamente	
vazia;*/
    } 
    public String toString(){

    /*que devolve	a	representação	textual	deste	jogo,	contendo	
    já	a	pontuação	(ver	outputs	fornecidos).*/
    return super.toString();
    } 
}
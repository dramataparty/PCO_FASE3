import java.util.List;

public class SingleScoreGame extends AbstractGame{
    /*
     * instancias representam, cuja pontuação só contabiliza a realização das jogadas, (NÃO CONTAM ELMINAÇÕES )
     * só terminam quando a àrea do jogo está copletamente vazia
     */
    int score;

    public void registerPlayScore(List<Integer> eliminated){
        /* Atualiza a pontuação do jogo com os resultados de uma jogada
         * a lista eleminated vai conter o nº de simbolos que foram eleminados em varias fases da jogada
         * a pontuação é calculada contabilizando somente a realização	das	jogadas	(não	conta	com	eliminações	feitas);
         */
        for(int i =0 ; i<eleminated.length;i++){
            



        }
    }

    public int score() {
        /* devolve a pontuação atual do jogo */
        return score;
    }
    public String toString() {
        


        /* representação textual deste jogo, com o score */
    }



    public boolean finished(){
        PlayArea p = new PlayArea(SIZE_OF_PIECE, score, SIZE_OF_PIECE, null, null, null, null, null);
        boolean infin = p.hasEnoughSpace(SIZE_OF_PIECE);
        boolean fin = !(infin);
        return fin;
        /*que	devolve	true se	a	área	de	jogo	está	completamente	
vazia;*/
    } 
    public String toString(){

    /*que devolve	a	representação	textual	deste	jogo,	contendo	
    já	a	pontuação	(ver	outputs	fornecidos).*/
    } 
}
public class SingleScoreGame extends AbstractGame{
    /*
     * instancias representam, cuja pontuação só contabiliza a realização das jogadas, (NÃO CONTAM ELMINAÇÕES )
     * só terminam quando a àrea do jogo está copletamente vazia
     */

    void registerPlayScore(List<Integer> eliminated){
        /* Atualiza a pontuação do jogo com os resultados de uma jogada
         * a lista eleminated vai conter o nº de simbolos que foram eleminados em varias fases da jogada
         * a pontuação é calculada contabilizando somente a realização	das	jogadas	(não	conta	com	eliminações	feitas);
         */
    }

    int score() {
        /* devolve a pontuação atual do jogo */
    }
    String toString() {
        /* representação textual deste jogo, com o score */
    }
    boolean finished(){
        /*que	devolve	true se	a	área	de	jogo	está	completamente	
vazia;*/
    } 
    String toString(){
    /*que devolve	a	representação	textual	deste	jogo,	contendo	
    já	a	pontuação	(ver	outputs	fornecidos).*/
    } 
}
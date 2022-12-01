public class MultipleRewardGame extends AbstractGame{
    /*
     * instancias desta subclasse representam jogos, cuja pontuação é calculada da mesma maneira q na fase 2
     * jogos terminam se n existir coluna em q caiba alguma peça
     * 
     */
    MultipleRewardGame(int r, int c, int diff, Symbol empty, Symbol[] values, Random gen, Eliminator elim, Accomodator acc){
    /*
     * inicializa nojo objeto "jogo"
     */

    }
    void registerPlayScore(List<Integer> eliminated){
        /* Atualiza a pontuação do jogo com os resultados de uma jogada
         * a lista eleminated vai conter o nº de simbolos que foram eleminados em varias fases da jogada
         * pontuação igual à fase2
         */
    }

    int score() {
        /* devolve a pontuação atual do jogo */
    }
    String toString() {
        /* representação textual deste jogo, com o score */
    }
}

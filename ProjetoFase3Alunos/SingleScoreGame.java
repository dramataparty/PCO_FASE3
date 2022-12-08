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
    }

    public int score() {
        /* devolve a pontuação atual do jogo */
        return score;
    }
    public String toString() {
        


        /* representação textual deste jogo, com o score */
    }



    public boolean finished(){
        boolean fin = false;
        for(int i =0; i < PlayArea.currentGrid.length; i++){
            for(int e =0; e < PlayArea.currentGrid[i].length ; e++){
                if(PlayArea.currentGrid[i][e]==Symbol.empty){
                    fin = true;

                }
                else{
                    fin = false;

                }

            }

        }
        return fin;
        /*que	devolve	true se	a	área	de	jogo	está	completamente	
vazia;*/
    } 
    public String toString(){
    /*que devolve	a	representação	textual	deste	jogo,	contendo	
    já	a	pontuação	(ver	outputs	fornecidos).*/
    } 
}
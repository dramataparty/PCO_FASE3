import java.util.List;

public class PatternEliminator implements Eliminator {

    List<Symbol[]>  patterns;

    PatternEliminator(List<Symbol[]> patterns){
        this.patterns=patterns;
        /* ????? como assim cria um novo eliminator??? */
        

    }

    @Override
    public int eliminateSequence(Symbol[] seq, int blockSize, Symbol nothing){
        /* arranjar referencia á length dos padroes a eleminar
         * corrigir o "erro" do e1count no if
         */


        int total_els = 0;
        for(int i = 0; i<this.patterns.size() ; i++){
            int e1count = 0;
            /* navega os padroes a eleminar, assume q têm a mesma length q um blocksize */
            for(int e = 0; e < i;e++){
                if(this.patterns.get(e)[i] == seq[e]){
                    e1count++;
                }
                else{
                    e1count = 0;
                }
            total_els += e1count;
            if (e1count >= 3){
                for(int u = e; u>(u-e1count);u--){
                    seq[u]=nothing;

                }
            }                           
        }    
}
return total_els; 
}

}
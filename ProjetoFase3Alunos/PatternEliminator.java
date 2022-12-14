/**
 * RepresentaÁ„o da interface Eliminator
 *@author Diogo Forte n∫ 56931, Tiago Pereira n∫55854, Miguel Pinto n∫51600
 */
import java.util.List;

public class PatternEliminator implements Eliminator {

    List<Symbol[]>  patterns;
    /**
     * Construtor da classe PatternEliminator.
     * @param patterns
     * @ensures InicializaÁ„o de todas as vari·veis no construtor.
     */
    PatternEliminator(List<Symbol[]> patterns){
        this.patterns=patterns;

        

    }

    /**
	 * FunÁ„o que procura uma sequÍncia	de sÌmbolos	contidos no array seq e substitui-os pelo sÌmbolo nothing.
	 * @param seq
	 * @param blockSize
	 * @param nothing 
	 * @requires seq != null, blockSize != null, nothing != null
	 * @return O n˙mero de sÌmbolos eliminados
	 * @ensures SequÍncia de sÌmbolos contidos no array seq È substituÌdo pelo sÌmbolo nothing, 
	 * caso a sequÍncia n„o exista ou o array n„o seja vazio.
	 */
    @Override
    public int eliminateSequence(Symbol[] seq, int blockSize, Symbol nothing){

        /* adaptar para percorrer os patterns */
        int i = 0;
        boolean matchpat;
		Symbol symbolToVerify;
        Symbol [] checkseq;
        int eliminated = 0;
        for(int e = 0; e<patterns.size();e++){

           

            checkseq = patterns.get(e);
            int k = i;

            int repetitions = 0;
            
            while(i < seq.length && eliminated == 0){
                symbolToVerify = seq[i];
                matchpat = (symbolToVerify==checkseq[i]);
                if(matchpat){
                    repetitions++;

                }
            }
            if(repetitions>=3){
                eliminated+= repetitions;

                for(int j = i; j < k; j++)
                        seq[j] = nothing;
             
                   }
            i=k;
            }
            return eliminated;   
            
            }
            /* 
            while(i < seq.length && eliminated == 0){
                repetitions = 0;
                symbolToVerify = seq[i];

                int k = i;
                while(k < seq.length && symbolToVerify == seq[k]){
                    k++;
                    repetitions++;
                }

                if(symbolToVerify == checkseq[i]) {
                    eliminated = repetitions;

                    for(int j = i; j < k; j++)
                        seq[j] = nothing;
                }

                i = k;
                */

            
        
		   
}            
        



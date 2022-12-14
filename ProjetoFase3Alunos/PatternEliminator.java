import java.util.List;

public class PatternEliminator implements Eliminator {

    List<Symbol[]>  patterns;

    PatternEliminator(List<Symbol[]> patterns){
        this.patterns=patterns;

        

    }


    @Override
    public int eliminateSequence(Symbol[] seq, int blockSize, Symbol nothing){

        /* adaptar para percorrer os patterns */
        int i = 0, repetitions = 0;
		Symbol symbolToVerify;
        for(int e = 0; i<patterns.size();i++){
            


        }
		int eliminated = 0;

		while(i < seq.length && eliminated == 0){
			repetitions = 0;
			symbolToVerify = seq[i];

			int k = i;
			while(k < seq.length && symbolToVerify == seq[k]){
				k++;
				repetitions++;
			}

			if(symbolToVerify != nothing) {
				eliminated = repetitions;

				for(int j = i; j < k; j++)
					seq[j] = nothing;
			}

			i = k;
		}

		return eliminated;      
            
}


}
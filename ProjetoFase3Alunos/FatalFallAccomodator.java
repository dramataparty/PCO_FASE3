import java.sql.SQLException;

public class FatalFallAccomodator implements Accomodator {

    private int fatalHeight;

    public FatalFallAccomodator(int fatalHeight){
        this.fatalHeight = fatalHeight;
        PlayArea.colsInGrid
            
        }
        
            /* acomoda seqs. de símbolos */
            /* fatalHeight represent a “altura” a	 partir	 da	 qual se considera	 que	 a	
acomodação	deve provocar a “morte”	de	todos os símbolos “acima” dos que são acomodados */        

    @Override
    public void accomodate(Symbol[] seq, Symbol nothing) {
        for(int i=0;i<seq.length-1;i++){
			if(seq[i]!=nothing&&seq[i+1]==nothing){
				for(int e=seq.length-1;e>0;e--){
					if(seq[e]!=nothing&seq[e-1]==nothing){
						seq[e-1]=seq[i];
						seq[i]=nothing;

					}
					
				}

			}
		}
	


    }
}
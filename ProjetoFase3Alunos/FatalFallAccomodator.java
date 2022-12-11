public class FatalFallAccomodator implements Accomodator {

    private int fatalHeight;

    public FatalFallAccomodator(int fatalHeight){
        this.fatalHeight = fatalHeight;
            
        }
        
            /* acomoda seqs. de símbolos */
            /* fatalHeight represent a “altura” a	 partir	 da	 qual se considera	 que	 a	
acomodação	deve provocar a “morte”	de	todos os símbolos “acima” dos que são acomodados */        

    @Override
    public void accomodate(Symbol[] seq, Symbol nothing) {

    }
}
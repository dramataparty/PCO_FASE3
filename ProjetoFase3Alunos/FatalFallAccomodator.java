

public class FatalFallAccomodator implements Accomodator {

    private int fatalHeight;
    private ClassicalTransformer classic = new ClassicalTransformer();

    public FatalFallAccomodator(int fatalHeight){
        this.fatalHeight=fatalHeight;

        /*
         * deve ir buscar aos de cima qual o index do primeiro n vazio
         * deve ir buscar o index do primeiro n vazio depois do anterior
         * if int diferenca entre esses >= fatalheight
         * todos os anteriores ao index final da acomodação ficam = EMPTY
         */
        /* 
        | - | e | - | e| e| e|
        */ 
        
        



            
        }
        
            /* acomoda seqs. de símbolos */
            /* fatalHeight represent a “altura” a	 partir	 da	 qual se considera	 que	 a	
acomodação	deve provocar a “morte”	de	todos os símbolos “acima” dos que são acomodados */        

    @Override
    public void accomodate(Symbol[] seq, Symbol nothing) {

        classic.accomodate(seq,nothing);
	
    }
}
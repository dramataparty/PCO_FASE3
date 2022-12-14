public class FatalFallAccomodator implements Accomodator {
    /**
     * Construtor da classe FatalFallAccomodator.
     * @param fatalHeight
     * @requires fatalHeight != null
     * @ensures inicializaÁ„o de todas as vari·veis no construtor.
     */
    private int fatalHeight;
    private ClassicalTransformer classic = new ClassicalTransformer();

    public FatalFallAccomodator(int fatalHeight){
        this.fatalHeight=fatalHeight;
                   
        }
    /**
     * FunÁ„o que acomoda sequÍncias de sÌmbolos.
     * @param seq
     * @param nothing
     * @requires seq != null, nothing != null
     * @ensures AcomodaÁ„o de uma dada sequÍncia de sÌmbolos, de forma a "fechar" todos os seus "buracos".
     */
    @Override
    public void accomodate(Symbol[] seq, Symbol nothing) {

        classic.accomodate(seq,nothing);
	
    }
}
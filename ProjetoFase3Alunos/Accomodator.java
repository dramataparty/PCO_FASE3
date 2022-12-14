/**
 * RepresentaÁ„o da interface Accomodator
 *@author Diogo Forte n∫ 56931, Tiago Pereira n∫55854, Miguel Pinto n∫51600
 */

public interface Accomodator {
    /**
     * FunÁ„o que acomoda sequÍncias de sÌmbolos.
     * @param seq
     * @param nothing
     * @requires seq != null, nothing != null
     * @ensures AcomodaÁ„o de uma dada sequÍncia de sÌmbolos, de forma a "fechar" todos os seus "buracos".
     */
    void accomodate(Symbol[] seq, Symbol nothing);
}
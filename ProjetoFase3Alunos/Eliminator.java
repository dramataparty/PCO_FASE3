/**
 * RepresentaÁ„o da interface Eliminator
 *@author Diogo Forte n∫ 56931, Tiago Pereira n∫55854, Miguel Pinto n∫51600
 */
public interface Eliminator {
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
    int eliminateSequence(Symbol[] seq, int blockSize, Symbol nothing);
}
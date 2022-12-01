/**
 * A class that represents objects that know how to eliminate and accomodate
 * symbols in a one-dimensional array
 * To be used by the class AbstractGame and subclasses of project phase 3
 * @author PCO Team
 *
 */
public class ClassicalTransformer implements Eliminator, Accomodator {
	private int blockSize;
	private Symbol nothing;
	
	/**
	 * Constructor.
	 * @param blockSize The minimum size of the sequences to eliminate
	 * @param nothing The symbol corresponding to the empty position
	 *                in sequences to eliminate and accomodate
	 */
	public ClassicalTransformer(int blockSize, Symbol nothing) {
		this.blockSize = blockSize;
		this.nothing = nothing;
	}
	
	/**
	 * No-arg constructor. 
	 * Method blockSize() will return 0 
	 * Method nothing() will return null
	 */
	public ClassicalTransformer() {

	}
	
	/**
	 * The minimum size of the sequences to eliminate
	 * @return
	 */
	public int blockSize() {
		return this.blockSize;
	}

	/**
	 * The symbol corresponding to the empty position
	 * in sequences to eliminate and accomodate
	 * @return
	 */
	public Symbol nothing() {
		return this.nothing;
	}


	/**
	 * This method searches for contiguous sequences of blockSize() or
	 * more equal elements on a one-dimensional array, and substitute
	 * them by nothing()
	 * @param sequence Array with symbols
	 * @requires sequence != null
	 * @return The number of eliminated elements
	 */
	public int eliminateSequence(Symbol[] sequence){
		int i = 0, repetitions = 0;
		Symbol symbolToVerify;
		int eliminated = 0;

		while(i < sequence.length && eliminated == 0){
			repetitions = 0;
			symbolToVerify = sequence[i];

			int k = i;
			while(k < sequence.length && symbolToVerify == sequence[k]){
				k++;
				repetitions++;
			}

			if(repetitions >= this.blockSize && symbolToVerify != this.nothing) {
				eliminated = repetitions;

				for(int j = i; j < k; j++)
					sequence[j] = this.nothing;
			}

			i = k;
		}

		return eliminated;
	}   

	/**
	 * This method accomodates a sequence of symbols in order to "close"
	 * all the "holes" it has, that is, all the internal sequences 
	 * containing the nothing() symbol
	 * @param sequence Array with symbols
	 * @requires sequence != null
	 */
	public void accomodate(Symbol[] sequence) {
		boolean needToAcomodate = true;
		while(needToAcomodate) {
			int howManyHoles = 0;
			int firstFilled = 0;
			for(int i = 0 ; i < sequence.length && sequence[i] == this.nothing ; i++) {
				firstFilled++;
			}
			// firstFilled has the position of the first element different from this.nothing
			int firstEmpty = firstFilled;
			for(int i = firstFilled ; i < sequence.length && sequence[i] != this.nothing ; i++) {
				firstEmpty++;
			}
			// firstEmpty has the position of the first element equal to this.nothing
			int l = firstEmpty;
			while(l < sequence.length && sequence[l] == this.nothing) {
				howManyHoles++; 
				l++;
			}
			// howManyHoles has the number of positions in the sequence that are "holes"
			for(int i = firstEmpty + howManyHoles - 1 ; i >= howManyHoles ; i--) {
				sequence[i] = sequence[i - howManyHoles];
			}
			for(int i = firstFilled + howManyHoles - 1 ; i >= 0 ; i--) {
				sequence[i] = this.nothing;
			}
			needToAcomodate = howManyHoles != 0;
		}
	}

	/**
	 * This method accomodates a sequence of symbols in order to "close"
	 * all the "holes" it has, that is, all the internal sequences 
	 * containing the nothing symbol
	 * @param sequence Array with symbols to accomodate
	 * @param nothing The symbol representing holes
	 * @requires sequence != null && nothing != null
	 */
	@Override
	public void accomodate(Symbol[] sequence, Symbol nothing) {
		this.nothing = nothing;
		accomodate(sequence);		
	}

	/**
	 * This method searches for contiguous sequences of blockSize or
	 * more equal elements on a one-dimensional array, and substitute
	 * them by nothing
	 * @param sequence Array with symbols
	 * @param blockSize The minimum size of the sequences to eliminate
	 * @param nothing The symbol representing holes
	 * @requires sequence != null && nothing != null
	 * @return The number of eliminated elements otherwise
	 */
	@Override
	public int eliminateSequence(Symbol[] sequence, int blockSize, Symbol nothing) {
		this.blockSize = blockSize;
		this.nothing = nothing;
		return eliminateSequence(sequence);
	}

}

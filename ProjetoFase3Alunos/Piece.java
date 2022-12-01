import java.util.Random;
/**
 * The instances of this class represent pieces that can be used 
 * in Column games.
 * 
 * @author PCO Team
 *
 */
public class Piece {
	private Symbol[] pessa;

	/**
	 * Constructor
	 * @param p An array with the symbols for the new piece
	 * @requires p != null
	 */
	public Piece(Symbol[] p) {
		this.pessa = new Symbol[p.length];
		for(int i = 0 ; i < p.length ; i++) {
			pessa[i] = p[i];
		}
	}
	
	/**
	 * Constructor
	 * @param gen A random generator
	 * @param size The number of symbols the new piece should have
	 * @param empty The symbol representing empty space
	 * @param symbs The universe of symbols that can be chosen
	 * @requires gen != null && size > 0 && empty != null && symbs != null
	 */
	public Piece(Random gen, int size, Symbol empty, 
			Symbol[] symbs) {
		this.pessa = new Symbol[size];
		int i = 0;
		while(i < size) {
			int rand = gen.nextInt(symbs.length);
			if(symbs[rand] != empty) {
				pessa[i] = symbs[rand];
				i++;
			}
		}
	}
	
	/**
	 * Permutates the piece a given number of places
	 * @param n The number of times
	 * @requires n > 0
	 */
	public void permutation(int n) {
		n = n % pessa.length;
		Symbol[] copy = new Symbol[pessa.length];
		for(int i = 0 ; i < copy.length ; i++) {
			copy[i] = pessa[(i + (pessa.length - n)) % pessa.length];
		}
		this.pessa = copy;
	}
	
	/**
	 * Textual representation of this piece
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Symbol elem : this.pessa) {
			sb.append(elem.toString() + System.lineSeparator());
		}
		return sb.toString();
	}
	
	/**
	 * A copy of this piece
	 * @return A copy of this pieace
	 */
	public Piece copy() {
		return new Piece(symbols());
	}
	
	/**
	 * A copy of the symbols that form this piece
	 * @return A copy of the symbols of this piece
	 */
	public Symbol[] symbols() {
		Symbol[] p = new Symbol[this.pessa.length];
		for(int i = 0 ; i < p.length ; i++) {
			p[i] = this.pessa[i];
		}
		return p;
	}
	
	/**
	 * The size of this piece
	 * @return
	 */
	public int size() {
		return pessa.length;
	}
}
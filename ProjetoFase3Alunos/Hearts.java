/**
 * An implementation of the Symbol interface
 * @author PCO Team
 */
public enum Hearts implements Symbol {
	
	RED("โค๏ธ"),
	ORANGE("๐งก"), 
	YELLOW("๐"), 
	GREEN("๐"), 
	BLUE("๐"), 
	EMPTY("๐ค");
	
	private String rep;
	Hearts(String s) {
		this.rep = s;
	}

	public String toString() {
		return this.rep;
	}

	public Hearts[] symbols() {
		return this.values();
	}
}

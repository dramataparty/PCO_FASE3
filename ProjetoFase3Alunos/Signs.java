/**
 * An implementation of the Symbol interface
 * @author PCO Team
 */
public enum Signs implements Symbol {
	
	CROSS("❌"),
	CIRCLE("⭕️"), 
	BALL("🛑"), 
	BANGS("‼️"), 
	CANNOT("🚫"), 
	EMPTY("❕");
	
	
	private String rep;
	Signs(String s) {
		this.rep = s;
	}

	public String toString() {
		return this.rep;
	}

	public Signs[] symbols() {
		return this.values();
	}
}

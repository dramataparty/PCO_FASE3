/**
 * An implementation of the Symbol interface
 * @author PCO Team
 */
public enum Hearts implements Symbol {
	RED("v"),
	ORANGE("l"), 
	YELLOW("a"), 
	GREEN("g"), 
	BLUE("b"), 
	EMPTY("-");
	/* 
	RED("❤️"),
	ORANGE("🧡"), 
	YELLOW("💛"), 
	GREEN("💚"), 
	BLUE("💙"), 
	EMPTY("🤍");
	*/
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

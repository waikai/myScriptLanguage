package stone;

public abstract class Token {
	public static final Token EOF = new Token(-1){}; // end of file
	public static final String EOL = "\\n"; // end of line
	private int lineNumber;
	public Token(int line) {
		// TODO Auto-generated constructor stub
		lineNumber = line;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public boolean isIdentifier() {
		return false;
	}
	public boolean isNumber() {
		return false;
	}
	public boolean isString() {
		return false;
	}
	public int getNumber() {
		throw new StoneException("Not Number Token");
	}
	public String getText() {
		return "";
	}
}

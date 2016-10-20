package stone;

import java.io.IOException;

public class ParseException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ParseException(Token t) {
		// TODO Auto-generated constructor stub
		this("", t);
	}
	public ParseException(String msg, Token t) {
		super("syntax error around" + location(t) + ". " + msg);
	}
	private static String location(Token t) {
		if (t == Token.EOF) {
			return "the last line";
		}else {
			return "\"" + t.getText() + "\" at line" + t.getLineNumber();
		}
	}
	public ParseException(IOException e) {
		super(e);
	}
	public ParseException(String mString) {
		// TODO Auto-generated constructor stub
		super(mString);
	}
}

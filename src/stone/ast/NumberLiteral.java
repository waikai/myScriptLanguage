package stone.ast;

import stone.Token;

public class NumberLiteral extends ASTLeaf {
	public NumberLiteral(Token t) {
		// TODO Auto-generated constructor stub
		super(t);
	}
	public int value() {
		return token().getNumber();
	}
}

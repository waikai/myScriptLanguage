package stone;
import stone.ast.ASTree;

public class StoneException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StoneException(String m) {
		// TODO Auto-generated constructor stub
		super(m);
	}
	public StoneException(String m, ASTree t) {
		// TODO Auto-generated constructor stub
		super(m + " " + t.location());
	}
}

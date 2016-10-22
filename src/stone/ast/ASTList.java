package stone.ast;

import java.util.Iterator;
import java.util.List;

public class ASTList extends ASTree {
	protected List<ASTree> children;
	public ASTList(List<ASTree> list) {
		// TODO Auto-generated constructor stub
		children = list;
	}
	public ASTree child(int i) {
		return children.get(i);
	}
	public Iterator<ASTree> children() {
		return children.iterator();
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('(');
		String sep = "";
		for (ASTree tree : children) {
			builder.append(sep);
			sep = " ";
			builder.append(tree.toString());
		}
		return builder.append(')').toString();
	}
	public String location() {
		for (ASTree t: children) {
			String string = t.toString();
			if (string != null) {
				return string;
			}
		}
		return null;
	}
	@Override
	public int numChildren() {
		// TODO Auto-generated method stub
		return children.size();
	}
}

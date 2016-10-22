package stone;
import static stone.Parser.rule;

import java.util.HashSet;
import stone.Parser.Operators;
public class BasicParser {
	HashSet<String> reserved = new HashSet<>();
	Operators operators = new Operators();
	Parser expr0 = rule();
	Parser primary = rule()
}

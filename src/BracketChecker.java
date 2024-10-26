import java.util.Stack;

public class BracketChecker {
	private final Stack<Character> stack;

	public BracketChecker() {
		stack = new Stack<>();
	}

	public boolean correctBrackets(String s) {
		int length = s.length();
		stack.clear();

		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
				continue;
			}
			if (s.charAt(i) == ')') {
				if (stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
}

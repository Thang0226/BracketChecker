public class BracketClient {
	public static void main(String[] args) {
		String[] tests = {"s * (s – a) * (s – b) * (s – c)",
				"(– b + (b2 – 4*a*c)^0.5) / 2*a",
				"s * (s – a) * (s – b * (s – c)",
				"s * (s – a) * s – b) * (s – c)",
				"(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"};
		BracketChecker checker = new BracketChecker();
		for (int i = 0; i < tests.length; i++) {
			if (checker.correctBrackets(tests[i])) {
				System.out.println((i + 1) + ") True");
			} else {
				System.out.println((i + 1) + ") False");
			}
		}
	}
}

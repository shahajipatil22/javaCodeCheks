package codeChecks;

public class ShortcircuitLogicShouldBeUsedInBooleanContexts {
	int a = 1;
	int c = 5;

	public void logic() {

		// EMB-ISSUE:

		// CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS
		if (a == 1 | c < 10) {
			System.out.println("This output" + "gets print");
		} else {
			System.out.println("This output" + "will not be printed");
		}
	}

	public void logic1() {
		// EMB-ISSUE:
		// CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS/no-detect
		if (a == 1 || c < 10) {
			System.out.println("This output" + "gets print");
		} else {
			System.out.println("This output" + "will not be printed");
		}

	}

	public void logic2() {
		// EMB-ISSUE:
		// CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS
		if (a == 1 & c < 10) {
			System.out.println("This output" + "gets print");
		} else {
			System.out.println("This output" + "will not be printed");
		}
	}

	public void logic3() {
		// EMB-ISSUE:
		// CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS/no-detect
		if (a == 1 && c < 10) {
			System.out.println("This output" + "gets print");
		} else {
			System.out.println("This output" + "will not be printed");
		}

	}

}

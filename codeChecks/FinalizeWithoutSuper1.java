public class FinalizeWithoutSuper1 {
	// EMB-ISSUE: CodeIssueNames.FINALIZE_WITHOUT_SUPER
	@Override
	protected void finalize() throws Throwable {
		try {
			// release resources here
		} catch (Throwable t) {
			throw t;
		}
	}
}
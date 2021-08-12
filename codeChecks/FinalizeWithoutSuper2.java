public class FinalizeWithoutSuper1 
    { 
		// EMB-ISSUE: CodeIssueNames.FINALIZE_WITHOUT_SUPER/no-detect
	protected void finalize()
    {
        try 
        {
            IO.writeLine("finalizing Class");
        }
        finally
        {
            try 
            {
                super.finalize();
            } 
            catch (Throwable exceptThrowable) 
            {
                IO.logger.log(Level.WARNING, "caught an exception calling super.finalize() from the class", exceptThrowable);
            }
        }
    }
    }
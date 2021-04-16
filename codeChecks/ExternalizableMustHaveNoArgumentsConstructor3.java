package codeChecks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//EMB-ISSUE: CodeIssueNames.EXTERNALIZABLE_MUST_HAVE_NO_ARGUMENTS_CONSTRUCTOR/no-detect
public class ExternalizableMustHaveNoArgumentsConstructor3 implements Externalizable {
	private String name;
	private int age;
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
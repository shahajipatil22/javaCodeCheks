package javacodechecker;

import javax.crypto.Cipher;
import javax.crypto.NullCipher;

public class AvoidUsingNullCipher {

	// EMB-ISSUE: CodeIssueNames.AVOID_NULL_CIPHER
	Cipher ci = new NullCipher();
	
	// EMB-ISSUE: CodeIssueNames.AVOID_NULL_CIPHER
	Cipher c7 = NullCipher.getInstance("AES");
	
	
	// EMB-ISSUE: CodeIssueNames.AVOID_NULL_CIPHER/no-detect
	Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
}

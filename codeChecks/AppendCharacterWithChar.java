package codeChecks;

public class AppendCharacterWithChar {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hi ");
		sb.append("u");
		sb.append('r');
		System.out.println(sb);

		StringBuilder sbf11 = new StringBuilder("Java ");
		CharSequence chSeq = "checks";
		sbf11.append(chSeq);
		System.out.println(sbf11);
	}
}
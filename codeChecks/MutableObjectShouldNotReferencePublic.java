package javacodechecker;

public class MutableObjectShouldNotReferencePublic {
    // EMB-ISSUE: CodeIssueNames.MUTABLE_OBJECT_SHOULD_NOT_REFERENCE_PUBLIC
    public static final String[] a = {"green","yellow","red","orange","purple"};

    // EMB-ISSUE: CodeIssueNames.MUTABLE_OBJECT_SHOULD_NOT_REFERENCE_PUBLIC/no-detect
    public static final String b = "This Is A String";

    // EMB-ISSUE: CodeIssueNames.MUTABLE_OBJECT_SHOULD_NOT_REFERENCE_PUBLIC/no-detect
    private static final String[] c = {"Mango","Orange","apple"};
}
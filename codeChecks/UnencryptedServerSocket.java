package javacodechecker;
import java.net.*;
import java.io.*;

public class UnencryptedServerSocket {

	// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SERVER_SOCKET
	ServerSocket soc = new ServerSocket(1234);
	// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SERVER_SOCKET/no-detect
	ServerSocket socket = SSLServerSocketFactory.getDefault().createServerSocket(1234);
}
package json.socket;

import java.net.ServerSocket;

public class MyServer {
	
	ServerSocket serverSocket;
	
	public void init() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		ms.init();
	}

}

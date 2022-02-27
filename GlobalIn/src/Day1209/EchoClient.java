package Day1209;

import java.io.*;
import java.net.*;

public class EchoClient {

	private String ip;
	int port;
	private String str;
	BufferedReader file;
	
	public EchoClient(String ip, int port) throws IOException {
		this.ip = ip;
		this.port = port;

		Socket tcpSocket = getSocket();
		OutputStream os = tcpSocket.getOutputStream();
		InputStream is = tcpSocket.getInputStream();

		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os));
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is));

		System.out.print("입력 : ");
		file = new BufferedReader(new InputStreamReader(System.in));
		str = file.readLine();
		str += System.getProperty("line.separator");
		
		bufferW.write(str);
		bufferW.flush();
		
		str = bufferR.readLine();
		System.out.println("Echo Result : " + str);
	       
		file.close();
		bufferW.close();
		bufferR.close();
		tcpSocket.close();
	}
	
	public Socket getSocket() {
		Socket tcpSocket = null;
		
		try {
			tcpSocket = new Socket(ip, port);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		
		return tcpSocket;
	}

	public static void main(String[] args) throws IOException {
		new EchoClient("localhost", 3000); // 원하는 서버의 IP 주소. 단, 포털 서버IP 는 금지
	}
}
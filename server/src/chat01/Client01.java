package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
//		포트번호 1100
//		192.168.5.15
		Socket socket = null;
		PrintWriter writer = null;
		
		String serverIp = "192.168.5.15";
		int portNum = 1100;
		
		String message = null;
		
		try {
			socket = new Socket(serverIp, portNum);
			System.out.println("서버에 연결되었습니다.");
			writer = new PrintWriter(socket.getOutputStream(), true);
			
			message = "메세지 전송 테스트";
			writer.println(message);
			System.out.println("서버로 메세지 전송 : " + message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null)
				writer.close();
			if(socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}

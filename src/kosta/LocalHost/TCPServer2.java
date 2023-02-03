package kosta.LocalHost;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer2 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {//192.168.4.14 //127.0.0.1
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.4.14", 10002)); //1.  (호스트 네임 , 포트번호)클라이언트 요청을 기다림  //Localhost 127.0.0.0 자기 자신을 가리킴
			System.out.println("[서버] 연결 기다림");
			Socket socket = serverSocket.accept(); // 2. 클라이언트가 들어오면 accept 값이 확인됨
			System.out.println("[서버] 연결됨"); //클라이언트 요청이 들어와야 실행됨.
			
			
			InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println( "[서버] 연결됨 from " + 
				inetSocketAddress.getHostName() + ":" + 
				inetSocketAddress.getPort() );
			
			//정보보내기
			OutputStream os = socket.getOutputStream();
			String data = "데이터 입력가능 \n";
			os.write(data.getBytes("UTF-8"));
			os.flush(); //즉시 보내기  -- 인풋에서는 지우기
			
				
			// 정보 받아오기
			// 데이터 받기
			InputStream is = socket.getInputStream();
			while( true ) {
			     byte[] buffer = new byte[128];
			     int readByteCount = is.read( buffer );
			        
			     if( readByteCount < 0 ) {
				         System.out.println( "[서버] 클라이언트로 부터 연결끊김" );
				     break;
				 }
				      
				 String recvData = new String( buffer, 0, readByteCount, "UTF-8" );
				 	
			     System.out.println("[서버] 데이터 수신 : "+ recvData );
			     
			     if (recvData.equalsIgnoreCase("exit")) {
			    	System.out.println("[서버] 클라이언트로 통신 종료 요청");
			    	
					break;
			     }
			   
			  }
		
			  
			  is.close();
			  os.close();
			  
			  socket.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (serverSocket != null && serverSocket.isClosed() == false) { // 소켓이 잘 닫혔는지 확인
				try {
					serverSocket.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

	}


}

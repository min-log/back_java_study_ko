package kosta.LocalHost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  private static final String ServerIP = "192.168.4.14";
  private static final int PORT = 10009;
  public static void main(String[] args) {
    Socket socket = null;
    Scanner sc = new Scanner(System.in);

    try {
       socket = new Socket(); //1. 소켓열기
       socket.connect(new InetSocketAddress(ServerIP, PORT)); // 2. 소켓 연결
       // 3. 내가 쓰는것  읽어주는 역할
       BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( socket.getInputStream(), "UTF-8" ) ); 
       // 4. 쓴것을 소켓으로 출력 getOutputStream 보내주는 역활
       PrintWriter printWriter = new PrintWriter( socket.getOutputStream() );
       
       while(true) {
         System.out.print( "<-");
         String request = sc.nextLine(); // 5. 보내고 싶은 내용 적을수 있게 .
         
         if(request == null) {
           System.out.println("접속 종료");
           break;
         }else {
           printWriter.print(request+"\n"); // 6. 소켓에 보낼 내용 정리
           printWriter.flush(); // 7. 소켓에 보내기
           System.out.println( "->" + bufferedReader.readLine()); //8. 적은 내용 다시 확인 echo
         }
       }
    } catch (IOException e) {
       e.printStackTrace();
    } finally {
       if (socket != null && socket.isClosed() == false) {
          try {
             socket.close();
          } catch (IOException ex) {
             ex.printStackTrace();
          }
       }
    }
  }
}

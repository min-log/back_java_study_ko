package kosta.LocalHost;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			/*여기 출력*/
			System.out.println(inetAddress);
			
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
			//System.out.println(inetAddress.getAddress());
			
			//상대방 주소 출력
			while (true) {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.print(">");
					String s = sc.next();
					InetAddress inetAddressa = InetAddress.getByName(s);
					System.out.println(inetAddressa);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			
			
		} catch (UnknownHostException e) {
				e.printStackTrace();
		}

	}

}

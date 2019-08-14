package javabridge.week2;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		try {
			Socket s= new Socket("192.9.83.201", 5000);
			System.out.println("## 클라이언트 실행..");
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Message Input: ");
			String msg = sc.next();
			pw.println("[현 암]"+msg);
			pw.close();
			s.close();
			System.out.println("## 클라이언트 종료.");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

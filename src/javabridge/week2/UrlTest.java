package javabridge.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest {
	public static void main(String[] args) {
		try{
			URL url = new URL("http://gachon.ac.kr/introduce/chairman/01.jsp");
			
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트: " + url.getHost());
			System.out.println("포트: " + url.getPort());
			
			System.out.println(">> HTML 시작");
			InputStream is = url.openStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			BufferedWriter writer = new BufferedWriter(new FileWriter("F:/JAVA/javabridge/test.html"));
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
				writer.write(msg+"\n");
			}
			br.close();
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

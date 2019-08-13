package javabridge.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileEditor {
	public static void main(String[] args) {
	System.out.println("## 간단한 메모장 v1.0");
	System.out.printf("## 저장할 파일명: ");
	Scanner sc = new Scanner(System.in);
	String filename = sc.next();
	System.out.printf("## 저장은 마지막 라인에 q입력");
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	BufferedWriter writer = new BufferedWriter(new FileWriter("F:/JAVA/javabridge"+filename));
			String s;
			while(!(s=reader.readLine()).equals("q")) {
				writer.write(s+"\r\n");
			}
			reader.close();
			writer.close();
			sc.close();
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("## 파일이 저장되었습니다. 프로그램을 종료 합니다.!!");
	
	
	}
}

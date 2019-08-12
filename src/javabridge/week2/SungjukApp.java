package javabridge.week2;

import java.util.ArrayList;

public class SungjukApp {
	ArrayList<Student> students = new ArrayList<>();
	
	public SungjukApp() {
		
		Student s = new Student();
		s.setStudent_num(20151234);
		s.setName("홍길동");
		ArrayList<Sungjuk> sungjuk = s.getSungjuk();
		
		Sungjuk sj = new Sungjuk();
		sj.setSubject("Java");
		sj.setScore(91);
		sungjuk.add(sj);
		
	}
	
	public static void main(String[] args) {
		;
		}
}

package javabridge.week2;

import java.util.ArrayList;

public class Student {
	private String name;
	private int student_num;
	private ArrayList<Sungjuk> sungjuk = new ArrayList<>();
	
	
	public ArrayList<Sungjuk> getSungjuk() {
		return sungjuk;
	}
	public void setSungjuk(ArrayList<Sungjuk> sungjuk) {
		this.sungjuk = sungjuk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_num() {
		return student_num;
	}
	public void setStudent_num(int student_num) {
		this.student_num = student_num;
	}
	
	public Student() {
		
	}

}

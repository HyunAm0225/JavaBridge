package student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MySchool implements ISchool {
	// 등록 회원 정보 배열 
	User[] users = new User[2];
	// 등록 학생 정보 배열
	Student[] students = new Student[4];
	// 학생 정보를 추가할수 있는 메뉴
	ArrayList<Student> menu = new ArrayList<Student>();
	// 키보드 입력으로 문자열을 입력받는 sc 객체 생성
	Scanner sc = new Scanner(System.in);
	// 선택한 사용자의 index 보관
	int searchUser;
	// 학교 정보 이름 
	String title;
	String filename = "school.txt";		
	
	public void setTitle(String title) {
		this.title=title;
	}

	
	public void start() {
		System.out.println(title + "==== 메인화면 - 계정 선택 ====");
		System.out.println("=========================");
		int i=0;
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getSearch_Type());
		}
		System.out.println("[x]종료");
		System.out.print("선택 : ");
		String search = sc.next();
		System.out.println("## "+search+"선택 ##");
		switch(search) {
		case "x":System.exit(0);break;
		default:
			searchUser = Integer.parseInt(search);
			studentList();
		}
	}
	
	public void studentList() {
		System.out.println(title+"==== 학생 목록 - 학생 선택 ====");
		System.out.println("=========================");
		int i=0;
		
		// 등록한 학생 정보 출력
		for(Student p : students) {
			System.out.print("["+i+"]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]학생출력");
		System.out.print("학생 선택 : ");
		String search = sc.next();
		System.out.println("## "+search+"선택 ##");

		// 선택한 메뉴에 따라 처리
		switch(search) {
			case "h":
				start();
				break;
			case "c":
				searchOut();
				break;
			default:
				int ssearch = Integer.parseInt(search);
				menu.add(students[ssearch]);
				studentList();
		}
	}
	public void searchOut() {
		System.out.println(title + "검색완료");
		System.out.println("===============");
		double total=0;
		int i=0;
		int max=0;
		for(Student p : menu) {
			System.out.printf("[%d]%s(%s)(%.3f)\n",i++,p.stu_name,p.student_num,p.stu_grade);
			total = total + p.stu_grade;
			max++;
		}
		System.out.println("=========================");
		
		
		System.out.println("검색 방법 : "+users[searchUser].getSearch_Type());

		System.out.println("선택 학생 평균 : "+total/max+" 점 입니다.");
		
		System.out.println("[p]이전 , [q]검색 완료, [s]메모장에 저장");
		System.out.print("선택 : ");
		String sel = sc.next();
		switch(sel) {
		case "q":
			System.out.println("## 검색이 완료 되었습니다. 종료합니다. ##");
			System.exit(0);
			break;
		case "p":
			studentList();
			break;
		case "s":
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("F:/JAVA/javabridge/"+filename));
				writer.write("전체 학생 평균 :"+total/max+"\r\n");
				writer.close();
			}catch(IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			searchOut();
	}
	}
	
	public void genUser() {
		User user = new User("사용자",Search_Type.USER);
		users[0]=user;
		user = new User("관리자",Search_Type.ADMIN);
		users[1]=user;
	}
	public void genStudent() {
		University un = new University("현 암",201533891,4.5,"가천대학교");
		students[0] = un;
		un = new University("현 준",20161234, 3.5, "광주대학교");
		students[1] = un;
		Graduate gr = new Graduate("홍길동",20090123,3.3,"가천대학원");
		students[2] = gr;
		gr = new Graduate("김서울",20111234,3.0,"서울대학원");
		students[3] = gr;
	}
	}

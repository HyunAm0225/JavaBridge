package student;
// 학교 학생 정의를 위한 추상클래스,
// 다양한 학생 정보를 지원하려고 기본 정보 설정과 출력만 추상클래스에서 지정하고
// 추가 정보는 서브클래스에서 구현하도록 유도한다.
public abstract class Student {
	// 학생 이름과 학번
	String stu_name;
	int student_num;
	double stu_grade;
	
	// 학생 이름과 학번을 출력하는 기본 정보 출력 메서드
	public void printDetail() {
		System.out.print("학생 이름: "+stu_name+" , " );
		System.out.print("학번 : "+student_num+" , ");
		System.out.print("학점 : "+stu_grade+" , ");
		printExtra();
	}
		public abstract void printExtra();
	}
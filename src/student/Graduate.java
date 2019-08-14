package student;
// 대학원생을 적는 항목입니다.
public class Graduate extends Student {
	String gradu_name;
	
	public Graduate(String stu_name, int student_num, double stu_grade, String gradu_name) {
		this.stu_name=stu_name;
		this.student_num=student_num;
		this.stu_grade=stu_grade;
		this.gradu_name=gradu_name;
	}
	@Override
	public void printExtra() {
		System.out.println("대학원 이름 : "+ gradu_name);
	}
}

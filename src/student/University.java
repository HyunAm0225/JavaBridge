package student;
//대학생을 적는 항목입니다.
public class University extends Student{
	String uni_name;
	
	public University(String stu_name, int student_num, double stu_grade, String uni_name) {
		this.stu_name=stu_name;
		this.student_num=student_num;
		this.stu_grade=stu_grade;
		this.uni_name=uni_name;
	}
	@Override
	public void printExtra() {
		System.out.println("대학교 : "+uni_name);
	}
}
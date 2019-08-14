
package student;

public class SchoolLauncher {

	
	// 프로그램 메인
	public static void main(String[] args) {
		ISchool school = new MySchool();
		school.setTitle("== 학생 검색 프로그램  v 1.0 ==\n");
		school.genUser();
		school.genStudent();
		school.start();
	}
}

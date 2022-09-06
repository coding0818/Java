package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P186 클래스 이름으로 static 변수 참조하기
 */
public class P186 {
	public static void main(String[] args) {
		P184 studentLee = new P184();
		studentLee.setStudentName("이지원");
		System.out.println(P184.serialNum);
		System.out.println(studentLee.studentName+" 학번"+studentLee.studentID);
		
		P184 studentSon = new P184();
		studentSon.setStudentName("손수경");
		System.out.println(P184.serialNum);
		System.out.println(studentSon.studentName+" 학번"+studentSon.studentID);
	}

}

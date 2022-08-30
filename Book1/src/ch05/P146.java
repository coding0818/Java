package ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 박가영
 * 내용 : P146 Student 실행 클래스 만들기
 */

class Student1{
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
}

public class P146 {
	
	
	public static void main(String[] args) {
		Student1 studentAhn = new Student1();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	
}

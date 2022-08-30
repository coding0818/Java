package ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 박가영
 * 내용 : P148 인스턴스 여러 개 생성하기
 */

class Student2{
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
}

public class P148 {
	
	
	public static void main(String[] args) {
		Student2 student1 = new Student2();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		Student2 student2 = new Student2();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}
	
	
}

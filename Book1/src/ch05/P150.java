package ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 박가영
 * 내용 : P150 참조 값 출력하기
 */

class Student3{
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
}

public class P150 {
	
	
	public static void main(String[] args) {
		Student3 student1 = new Student3();
		student1.studentName = "안연수";
		Student3 student2 = new Student3();
		student2.studentName = "안승연";
		System.out.println(student1);
		System.out.println(student2);
	}
	
	
}

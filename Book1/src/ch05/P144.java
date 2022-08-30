package ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 박가영
 * 내용 : P144 Student 클래스에 main()함수 추가하기
 */

class Student{
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
}
public class P144 {
	
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	
}

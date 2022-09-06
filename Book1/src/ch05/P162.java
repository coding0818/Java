package ch05;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P162 private사용하기
 */
public class P162 {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}

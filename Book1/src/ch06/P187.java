package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P187 serialNum의 get(),set() 메서드 사용하기
 */
public class P187 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public P187() {
		serialNum++;          
		studentID = serialNum; 
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		P187.serialNum = serialNum;
	}
}

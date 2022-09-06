package ch05;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P163, 165 private 변수 테스트하기, private 변수에 접근하기
 */
public class P163 {
	public static void main(String[] args) {
		P162 studentLee = new P162();
		//studentLee.studentName() = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}

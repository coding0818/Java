package ch06;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P183 static 변수 테스트하기
 */
public class P183 {
	public static void main(String[] args) {
		P182 studentLee = new P182();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);//serialNum 변수의 초깃값 출력
		studentLee.serialNum++;
		
		P182 studentSon = new P182();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}

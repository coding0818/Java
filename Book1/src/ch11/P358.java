package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P358 Object 클래스의 equals()메서드 사용하기
 */
class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String toString() {
		return studentId+","+studentName;
	}
}
public class P358 {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee==studentLee2){ //기호로 비교
			System.out.println("studentLee와 studentLee2 의 주소는 같습니다.");
		}else {
			System.out.println("studentLee와 studentLee2 의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) { //equals 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		}else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		if(studentLee==studentSang){ //기호로 비교
			System.out.println("studentLee와 studentSang 의 주소는 같습니다.");
		}else {
			System.out.println("studentLee와 studentSang 의 주소는 다릅니다.");
		}

		if(studentLee.equals(studentSang)) { //equals 메서드로 비교
			System.out.println("studentLee와 studentSang은 동일합니다.");
		}else {
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		}
	}

}

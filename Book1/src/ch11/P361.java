package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P361 equals() 메서드 재정의하기
 */
class Student1{
	int studentId;
	String studentName;
	
	public Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String toString() {
		return studentId+","+studentName;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 std = (Student1)obj;
			if(this.studentId == std.studentId) {
				return true;
			}else return false;
		}return false;
	}
}
public class P361 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1(100, "이상원");
		Student1 studentLee2 = studentLee;
		Student1 studentSang = new Student1(100, "이상원");
		
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
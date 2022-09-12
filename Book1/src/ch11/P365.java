package ch11;
/*
 * 날짜 : 2022/09/12
 * 이름 : 박가영
 * 내용 : P365 hashcode() 메서드 재정의하기
 */
class Student2{
	int studentId;
	String studentName;
	
	public Student2(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String toString() {
		return studentId+","+studentName;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if(this.studentId == std.studentId) {
				return true;
			}else return false;
		}return false;
	}
	
	public int hashcode() {
		return studentId;
	}
}
public class P365 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2(100, "이상원");
		Student2 studentLee2 = studentLee;
		Student2 studentSang = new Student2(100, "이상원");
		
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
		
		System.out.println("studentLee의 hashCode : "+studentLee.hashcode());
		System.out.println("studentSang의 hashCode : "+studentSang.hashcode());
	
		System.out.println("studentLee의 실제 주소값 : "+System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : "+System.identityHashCode(studentSang));
	}

}
package ch06;
/*
 * 날짜 : 2022/09/03
 * 이름 : 박가영
 * 내용 : P265 has-a 관계예제
 */
class Date{
	private int year, month, date;
	
	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public String toString() {
		return "Date [year=" + year + ", month="+month+", date="+date+"]";
	}
}
class Employeer{
	private String name;
	private Date birthDate;
	public Employeer(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	public String toString() {
		return "Employee [name=" + name + ", birthDate="+birthDate+"]";
	}
}
public class P265 {
	public static void main(String[] args) {
		Date birth = new Date(1990,1,1);
		Employeer employee = new Employeer("홍길동",birth);
		System.out.println(employee);
	}

}

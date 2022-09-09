package ch08;
/*
 * 날짜 : 2022/09/09
 * 이름 : 박가영
 * 내용 : P242 상속에서 클래스 생성 과정(2)
 */
public class P242 extends P241{
	private int agentID;
	double saleRatio;
	
	public P242() {
		customerGrade = "VIP";  //상위클래스에서 private변수이므로 오류발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출"); //하위 클래스 생성할 때 콘솔 출력문
	}
	public int getAgentID(){
		return agentID;
	}

}

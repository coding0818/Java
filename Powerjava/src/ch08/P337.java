package ch08;
/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P337 getClass() 메소드
 */
class Circle{}
public class P337 {
    public static void main(String[] args) {
	
    	Circle obj = new Circle();
    	System.out.println("obj is of type "+obj.getClass().getName());
    	System.out.println("obj의 해쉬코드="+obj.hashCode());
    }
}


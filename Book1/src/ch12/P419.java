package ch12;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P419 스택 구현하기
 */
class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return(arrayStack.remove(len-1)); //맨뒤에 있는 자료 반환하고 배열에서 제거
	}
}
public class P419 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

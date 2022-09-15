package ch12;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/14
 * 이름 : 박가영
 * 내용 : P420 큐 구현하기
 */
class myQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String deQueue() {
		int len = arrayQueue.size();
		if(len==0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		return(arrayQueue.remove(0));
	}
}
public class P420 {
	public static void main(String[] args) {
		
		myQueue queue = new myQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
	

}

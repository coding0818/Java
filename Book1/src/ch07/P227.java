package ch07;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/06
 * 이름 : 박가영
 * 내용 : P227 Student 클래스 구현하기
 */
public class P227 {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public P227(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //Subject 생성하기
		subject.setName(name);           //과목 이름 추가하기
		subject.setScorePoint(score);    //점수 추가하기
		subjectList.add(subject);        //배열에 저장하기
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 "+studentName+"의 "+s.getName()+" 과목 성적은"+s.getScorePoint()+"입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은"+total+"입니다.");
	}

}

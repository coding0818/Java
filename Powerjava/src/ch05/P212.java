package ch05;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 박가영
 * 내용 : P212 객체 배열 만들기
 */
class Movie{
	String title, director;
	static int count;
	public Movie(String title, String director) {
		this.title=title;
		this.director=director;
		count++;
	}
}
public class P212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie[] list = new Movie[10];
		list[0] = new Movie("백투더퓨처", "로버트 저메키스");
		list[1] = new Movie("티파니에서 아침을", "에드워드 블레이크");
		
		for(int i=0; i<Movie.count; i++) {
			System.out.println("=======================");
			System.out.println("제목: "+list[i].title);
			System.out.println("감독: "+list[i].director);
			System.out.println("=======================");
		}
	}

}

package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String grade = "F";
		
		System.out.println("성적: ");
		int score = sc.nextInt();
		
		while(!(score>=0&&score<=100)){
			System.out.println("유효하지 않은 점수");
			System.out.println("성적: ");
			score = sc.nextInt();
		}
		
		switch(score/10){
		case 10:
		case 9:
			grade = "A";break;
		case 8:
			grade = "B";break;
		case 7:
			grade = "C";break;
		case 6:
			grade = "D";
		}
		
		switch(score/10){
		case 10:
			grade +="+"; break;
		case 9: case 8: case 7: case 6:
			switch(score%10){
			case 9:
			case 8:
			case 7:
				grade+="+";break;
			case 2:
			case 1:
			case 0:
				grade+="-";break;
			}
		}
		
		System.out.printf("%d점은 %s학점입니다.",score,grade);
		
	}

}

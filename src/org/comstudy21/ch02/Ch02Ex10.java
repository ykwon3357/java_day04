package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex10 {

	public static void main(String[] args) {
		// 나이 입력
		// 미성년자 청년 장년 노년 구분
		// 0~19 20~40 41~65 66~
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("나이: ");
			int age = sc.nextInt();

			String result = "미성년자";
			if (age > 65)
				result = "노년";
			else if (age > 40)
				result = "장년";
			else if (age > 19)
				result = "청년";

			System.out.printf("%d세는 %s입니다.", age, result);
		} catch (Exception e) {
			System.out.println("숫자만 입력할 것.");
			main(null);
		}

	}

}

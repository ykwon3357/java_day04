package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex14 {

	// 1+1+2+3+5+8+13+21 = 54
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피보나치 항 수를 입력하시오: ");
		int END = sc.nextInt();

		int a = 1, b = 1, c = 0, sum = 0;
		for (int i = 1; i <= END; i++) {
			a = b;
			b = c;
			c = a + b;
			sum += c;
			System.out.printf(c + "%s", (i == END) ? "=" : "+");
		}
		System.out.print(sum);
	}

}

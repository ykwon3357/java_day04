package org.comstudy21.ch02;

import java.util.Scanner;

/*과제
 *     *
 *    ***
 *   *****
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Ch02Ex13 {

	/*주말 과제1   i * *-i cnt
	 * *********0 9 9   
	 * **** ****1 8 7   4
	 * ***   ***2 6 4   3
	 * **     **3 4 1   2
	 * *       *4 2 -2  1
	 * **     **5 4 -1  2
	 * ***   ***6 6 0   3
	 * **** ****7 8 1   4
	 * *********8 9 1   
	 */
	static Scanner sc = new Scanner(System.in);

	public static void test11(String[] args) {
		int cnt = 4;

		for (int i = 0; i < 9; i++) {
			if (i == 0 || i == 8) {
				for (int j = 0; j < 9; j++) {
					System.out.print("*");
				}
			} else {

				for (int j = 0; j <= cnt; j++) {
					System.out.print("*");
				}

				for (int j = 0; j < 7 - 2 * cnt; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j <= cnt; j++) {
					System.out.print("*");
				}
			}
			cnt = (i < 4) ? cnt - 1 : cnt + 1;
			System.out.println();

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("홀수 입력: ");
		int end = sc.nextInt();
		// 유효성 검사
		while (end % 2 == 0) {
			System.out.println("홀수만 입력하시오!\n홀수 입력: ");
			end = sc.nextInt();
		}
		int mid = end / 2;

		// 구현
		int cnt = mid;
		for (int i = 0; i < end; i++) {
			if (i == 0 || i == (end - 1)) {
				for (int j = 0; j < end; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= cnt + (end - 2) - 2 * cnt; j++) {
					System.out.print((j <= cnt) ? "*" : " ");
				}
				for (int j = 0; j <= cnt; j++) {
					System.out.print("*");
				}
			}
			cnt = (i < mid) ? cnt - 1 : cnt + 1;
			System.out.println();
		}
	}
	/*
	 * int cnt=3;
	
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j <= cnt ; j++) {
			System.out.print("*");
		}
		for(int j=0;j<7-2*cnt;j++){
			System.out.print(" ");
		}
		for (int j = 0; j <= cnt ; j++) {
			System.out.print("*");
		}
		cnt=(i<3)?cnt-1:cnt+1;
		System.out.println();
	}
	 */

	public static void test10(String[] args) {

		System.out.println("홀수 입력:");
		int end = sc.nextInt();
		int mid = end / 2;

		int cnt = mid;
		for (int i = 0; i < end; i++) {
			for (int j = 0; j < cnt; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < end - 2 * cnt; j++) {
				System.out.print("*");
			}
			cnt = (i < mid) ? cnt - 1 : cnt + 1;
			System.out.println();
		}

	}

	public static void test9(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 9 - i * 2; j++) {
				System.out.print(j < i ? " " : "*");
			}
			/*for(int j=0;j<9-i*2;j++){
				System.out.print("*");
			}*/
			System.out.println();
		}

	}

	public static void test8(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i + i * 2 + 1; j++) {
				System.out.print(j < 4 - i ? " " : "*");
			}
			/*for(int j=0;j<i*2+1;j++){
				System.out.print("*");
			}*/
			System.out.println();
		}
	}

	public static void test7(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("홀수 입력: ");
			int END = sc.nextInt();

			// 유효성 체크
			while (END % 2 == 0) {
				System.out.println("훌수만 입력할 것.");
				System.out.println("홀수 입력: ");
				END = sc.nextInt();
			}
			int MID = END / 2;

			// 마름모 구현
			int temp = MID;
			for (int i = 0; i < END; i++) {

				for (int j = 0; j < temp; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < END - 2 * temp; j++) {
					System.out.print("*");
				}

				System.out.println();
				temp = (i < MID) ? temp - 1 : temp + 1;
			}
		} catch (Exception e) {
			System.out.println("홀수만 입력할 것.");
			main(null);
		}

	}

	public static void test6(String[] args) {

		int end = 1;
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < end; j++) {
				System.out.print("*");
			}

			System.out.println();
			end = (i < 4) ? end + 1 : end - 1;

			/*int end =4;
			for(int i=0; i<9; i++){
				
				for(int j=0;j<end;j++){
					System.out.print(" ");
				}
				for(int j=0;j<9-2*end;j++){
					System.out.print("*");
				}
				
				System.out.println();
				end = (i<4)? end-1: end+1;
			}*/

		}
		/*public static void test5(String[] args1) {
			Scanner sc = new Scanner(System.in);
		
			
				System.out.println("홀수 입력: ");
				int END = sc.nextInt();
		
				// 유효성 체크
				while (END % 2 == 0) {
					System.out.println("훌수만!! 입력하시오!!!");
					System.out.println("홀수 입력: ");
					END = sc.nextInt();
				}
				int MID = END / 2;
		
				// 마름모 구현
				for (int i = 0; i < END; i++) {
					if (i < MID) {
						for (int j = 0; j < MID - i; j++)
							System.out.print(" ");
						for (int j = 0; j < 2 * i + 1; j++)
							System.out.print("*");
					} else {
						for (int j = i - MID; j > 0; j--)
							System.out.print(" ");
						for (int j = 2 * END - 1 - 2 * i; j > 0; j--)
							System.out.print("*");
					}
					System.out.println();
		
				}
		}*/

		/*for (int i = 0; i < 7; i++) {
			if (i < 4) {
				for (int j = 0; j < 3-i; j++) 
					System.out.print(" ");
				for (int j = 0; j < 2*i+1; j++) 
					System.out.print("*");
			} else {
				for (int j = i-3; j > 0 ; j--)
					System.out.print(" ");
				for (int j = 13-2*i; j > 0; j--) 
					System.out.print("*");
			}
			System.out.println();
		}*/

		/*for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < 9 - i; j++)
					System.out.print("*");
			}
			System.out.println();
		
		}*/

		/*for(int i=0; i<4; i++){
			for(int j=0;j<4;j++){
				System.out.print(j<3-i?"^":"*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++){
			for(int j=0;j<5;j++){
				System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}*/
	}

	public static void test4(String[] args) {

		/*
		for(int i=0; i<4; i++){
			for(int j=0;j<3-i;j++){
				System.out.print("^");
			}
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<3; i++){
			for(int j=0;j<i+1;j++){
				System.out.print("^");
			}
			for(int j=3;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}*/

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j < i ? " " : "*");
			}
			System.out.println();
		}

		/*for(int i=0; i<5; i++){
			for(int j=0;j<i;j++){
				System.out.print("^");
			}
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}*/

	}

	public static void test3(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(j < 3 - i ? "^" : "*");
			}
			System.out.println();
		}

		/*
		for (int i = 0; i < 7; i++) {
			if (i < 4) {
				for (int k = (3 - i); k > 0; k--) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * i + 1); j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = i - 3; k > 0; k--) {
					System.out.print(" ");
				}
				for (int j = 14 - (2 * i + 1); j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}*/

		/*
		for(int i=0;i<4;i++){
			for(int k=(3-i); k>0; k--){
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++){
			  System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++){
			for(int k=3-i; k<4; k++){
				System.out.print(" ");
			}
			for(int j=6-(2*i+1);j>0;j--){
			  System.out.print("*");
			}
			System.out.println();
		}*/

	}

}

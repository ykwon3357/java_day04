package org.comstudy21.ch02;

//과제, 3항연산으로 바꿔보자
//1+2-3+4-5+6-7+8-9+10=7
public class Ch02Ex12 {
	static final int END = 10;

	public static void test(String[] args) {
		int total = 2;
		//3항연산
		for(int i = 1;i<=END;i++){
			total += (i%2==0)? +i:-i;
			if(i==END) {System.out.print(END+"="+total); break;}
				
			System.out.printf(i+"%s",(i%2!=0)? "+":"-");
		}
		//else if	
		/*for (int i = 1; i <= END ; i++) {

			if (i % 2 == 1&& i < END) {
				System.out.print(i + "+");
				total -= i;
			} else if (i % 2 == 0 && i < END) {
				System.out.print(i + "-");
				total += i;
			} else {
				total += i + 2;
				System.out.print(i + "=" + total);
			}

		}*/
	}

	public static void main(String[] args) {
		test(args);
	}
}

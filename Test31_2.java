package Chap03;

// 실습 3 : do-while문을 이용하여 구구단 출력하기

public class Test31_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + " ");
				j++;
			} while (j < 10);
			System.out.println("\n");
			i++;
		} while (i < 10);
		
		/* 5단까지만 출력
		 * 
		 * int i = 1;
		do {
			int j = 1;
			do {
			    if (j > 5) 
			       continue; // 다음 실행 안하고 while로 >> j는 5보다 크면 증가 안함
				System.out.print(i + "*" + j + "=" + i * j + " ");
				j++;
			} while (j < 10);
			System.out.println("\n");
		} while (i++ < 10);
		 */
	}
}

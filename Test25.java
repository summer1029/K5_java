package Chap03;

// 반목문 >> for, while, do-while

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 등차 수열 : 공차가 5, 첫 번째 수가 0
		int a = 0;
		int b = 5;

		/*
		 * for (int i = 0; i < 10; i++) { // for(초기값, 조건문, 증감) 
		 * System.out.println("i = " + i + " a = " + a); 
		 * a = a + b; 
		 * }
		 */

		/*
		 * int i = 0; // 변수 등록시 가능한 초키화를 시킨다 = 0 
		 * while (i < 5) {
		 * System.out.println("i = " + i + " a = " + a); 
		 * a = a + b; 
		 * i++;
		 * }
		 */
	 
		int i = 0;
		do {
			System.out.println("i = " + i + " a = " + a);
			a = a + b;
			i = i + 1;
		} while (i < 5);
	}
}

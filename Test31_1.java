package Chap03;

// 실습 2 : while문만 사용하여 구구단 출력하기

public class Test31_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("구구단");
		
		int i = 1;
		int j = 1;

		while (i < 10) {
			while (j < 10) {
				System.out.print(" " + j + "*" + i + "=" + i * j);
				j++;
			}
			System.out.println("\n"); // enter 역할
			j = 1; // j를 다시 리셋 시켜줘야한다
			i++;
		}
	}
}

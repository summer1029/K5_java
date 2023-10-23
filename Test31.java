package Chap03;

// 실습 1 : for문을 사용하여 구구단 출력하기 (Test31의 변형)

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("구구단");

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(" " + j + "*" + i + "=" + i * j);
			}
			System.out.println("\n");
		}
	}
}

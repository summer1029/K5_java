package Chap03;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 6;
		if (i % 2 == 0) {
			if (i % 3 == 0)
				System.out.println(i + "는 2, 3의 배수입니다");
		}
		
		for (int a = 0; a < 10; a++)
			for (int b = 0; b < 10; b++) {
				System.out.print(a*b);
			}
		System.out.println("\n");
	}

}

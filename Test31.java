package Chap03;

// �ǽ� 1 : for���� ����Ͽ� ������ ����ϱ� (Test31�� ����)

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������");

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(" " + j + "*" + i + "=" + i * j);
			}
			System.out.println("\n");
		}
	}
}

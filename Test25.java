package Chap03;

// �ݸ� >> for, while, do-while

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���� : ������ 5, ù ��° ���� 0
		int a = 0;
		int b = 5;

		/*
		 * for (int i = 0; i < 10; i++) { // for(�ʱⰪ, ���ǹ�, ����) 
		 * System.out.println("i = " + i + " a = " + a); 
		 * a = a + b; 
		 * }
		 */

		/*
		 * int i = 0; // ���� ��Ͻ� ������ ��Űȭ�� ��Ų�� = 0 
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

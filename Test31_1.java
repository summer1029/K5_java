package Chap03;

// �ǽ� 2 : while���� ����Ͽ� ������ ����ϱ�

public class Test31_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������");
		
		int i = 1;
		int j = 1;

		while (i < 10) {
			while (j < 10) {
				System.out.print(" " + j + "*" + i + "=" + i * j);
				j++;
			}
			System.out.println("\n"); // enter ����
			j = 1; // j�� �ٽ� ���� ��������Ѵ�
			i++;
		}
	}
}

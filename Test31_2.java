package Chap03;

// �ǽ� 3 : do-while���� �̿��Ͽ� ������ ����ϱ�

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
		
		/* 5�ܱ����� ���
		 * 
		 * int i = 1;
		do {
			int j = 1;
			do {
			    if (j > 5) 
			       continue; // ���� ���� ���ϰ� while�� >> j�� 5���� ũ�� ���� ����
				System.out.print(i + "*" + j + "=" + i * j + " ");
				j++;
			} while (j < 10);
			System.out.println("\n");
		} while (i++ < 10);
		 */
	}
}

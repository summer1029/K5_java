package Chap03;

//switch-case��

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'F';

		switch (grade) { // switch �� >> 3���� �̻� �з� >> case, break
		case 'A':
			System.out.println("90�� �̻�");
			break; // ����� ���� ������ �ϴ� ��ɾ�
		case 'B':
			System.out.println("80�� �̻�");
			break;
		case 'C':
			System.out.println("70�� �̻�");
			break;
		case 'D':
			System.out.println("60�� �̻�");
			break;
		default: // if-else���� else ������ ��
			System.out.println("60�� �̸�");
		}
	}
}

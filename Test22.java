package Chap03;

// switch-case��

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		char op = '+';
		
		switch(op) { // switch �� >> 3���� �̻� �з� >> case, break
		case '+' :
			System.out.println(a+b);
			break; // ����� ���� ������ �ϴ� ��ɾ�
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
			break;
		case '/' :
			System.out.println(a/b);
			break;
			
		/*
		 * (�����ϳ� 3���� �̻� �з��� �ϰ� �Ǹ� if�� ���� swith���� ����ϱ�)
		 * if (op == '+') {
		 * System.out.println(a+b);
		 * }
		 * else if (op == '-') {
		 * System.out.println(a=b);
		 * }
		 * ...
		 */
		}
	}
}

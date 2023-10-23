package Chap03;

// switch-case문

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		char op = '+';
		
		switch(op) { // switch 문 >> 3가지 이상 분류 >> case, break
		case '+' :
			System.out.println(a+b);
			break; // 블록을 빠져 나오게 하는 명령어
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
		 * (동일하나 3가지 이상 분류를 하게 되면 if문 보다 swith문을 사용하기)
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

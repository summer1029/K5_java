package Chap03;

//switch-case문

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'F';

		switch (grade) { // switch 문 >> 3가지 이상 분류 >> case, break
		case 'A':
			System.out.println("90점 이상");
			break; // 블록을 빠져 나오게 하는 명령어
		case 'B':
			System.out.println("80점 이상");
			break;
		case 'C':
			System.out.println("70점 이상");
			break;
		case 'D':
			System.out.println("60점 이상");
			break;
		default: // if-else문의 else 역할을 함
			System.out.println("60점 미만");
		}
	}
}

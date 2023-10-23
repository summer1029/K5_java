package Chap03;

// if ÁßÃ¸¹®

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		int bonus;
	
		
		if (score < 100) {
			bonus = 10;
		}
		else if (100 < score & score < 200) { // else if (score < 200)
			bonus = 20;
		}
		else {
			bonus = 30;
		}
		score += bonus;
		System.out.println(bonus);
	}
}

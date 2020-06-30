package java05;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		//ExamList list = new ExamList(3);
		ExamConsole con = new ExamConsole();
		
		// exam. -> 연산자
		int menu = 0;
		boolean flag = true;

		while (flag) {

			menu = con.selectMenu();

			switch (menu) {
			case 1:
				con.inputScore();
				break;

			case 2:
				con.displayScore();
				// displayScore(list,1);
				break;

			case 3:
				flag = false;
				break;
			}
		}
		System.out.println("종료합니다.");
	}


}

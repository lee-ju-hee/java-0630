package java05;

import java.util.Scanner;

public class ExamConsole {

	ExamList list = new ExamList();
	
	//instance=object=this
	public int selectMenu() {

		// �޴�
		Scanner scan = new Scanner(System.in);

		int menu;
		System.out.println("������������������������");
		System.out.println("��  �޴� ����   ��");
		System.out.println("������������������������");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� >> ");
		menu = scan.nextInt();
		return menu;
	}
	
	void displayScore() {
		// ���
		displayScore(list.current);
	}

	void displayScore(int size) {
		// ���
		int total = 0;
		double avg = 0.0;

		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			total = exam.total();
			avg = exam.avg();
			
			System.out.println("������������������������");
			System.out.println("��  ���� ���   ��");
			System.out.println("������������������������");

			System.out.printf("����: %d\n", kor);
			System.out.printf("����: %d\n", eng);
			System.out.printf("����: %d\n", math);

			System.out.printf("����: %d\n", total);
			System.out.printf("���: %6.2f\n", avg);// ��ü 6�ڸ� �� �Ҽ��� 2��°����

			System.out.println("------------------");
		}
	}
	
	void inputScore() {

		Scanner scan = new Scanner(System.in);
		// �Է�
		System.out.println("������������������������");
		System.out.println("��  ���� �Է�   ��");
		System.out.println("������������������������");

		int kor, eng, math;

		do {
			System.out.print("����: ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("���������� (0~100) ������ϴ�.");
		} while (kor < 0 || kor > 100);

		do {
			System.out.print("����: ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("���������� (0~100) ������ϴ�.");
		} while (eng < 0 || eng > 100);

		do {
			System.out.print("����: ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("���������� (0~100) ������ϴ�.");
		} while (math < 0 || math > 100);

		
		Exam exam = new Exam(kor, eng, math);
		list.add(exam);
		System.out.println("------------------");
	}
}

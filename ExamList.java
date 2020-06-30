package java05;

import java.util.Scanner;

public class ExamList {

	Exam[] exams;
	int current;

	public ExamList() {
		this(3);
	}

	public ExamList(int size) {
		// exams = new Exam[size];
		// current = 0;
		this(new Exam[size], 0);
	}

	public ExamList(Exam[] exams, int current) {
		super();
		this.exams = exams;
		this.current = current;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		if (current > 3) {
			System.out.println("�迭�� ũ�⸦ Ȯ���ϼ���.");
		} else {
			this.current = current;
		}
	}



	public void add(Exam exam) {
		
		// �ȿ� �迭�� �� á���� Ȯ���ϴ� �κ�
		int size = this.current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size + 3];
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			this.exams = temp;
		}
		
		this.exams[this.current] = exam;
		this.current++;

		exams[current] = exam;
		current++;		
		
		// �������
		System.out.println("------------------");
	}

	

	public Exam get(int i) {
		
		return exams[i];
	}
}

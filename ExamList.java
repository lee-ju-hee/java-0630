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
			System.out.println("배열의 크기를 확인하세요.");
		} else {
			this.current = current;
		}
	}



	public void add(Exam exam) {
		
		// 안에 배열이 다 찼는지 확인하는 부분
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
		
		// 여기까지
		System.out.println("------------------");
	}

	

	public Exam get(int i) {
		
		return exams[i];
	}
}

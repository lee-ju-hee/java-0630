package java_ver02;

import java05.Exam;

public class BsksExam extends Exam {

	private int com;

	public BsksExam() {
		
		this(0, 0, 0, 0);
	}

	public BsksExam(int kor, int eng, int math, int com) {

		super(kor, eng, math);
		this.com = com;
	}

	public int getCom() {
		
		return com;
	}

	public void setCom(int com) {
		
		this.com = com;
	}

	@Override
	public int total() {

		return onTotal() + com;
	}

	@Override
	public double avg() {

		return total() / 4.0;
	}
}
package java_ver02;

import java05.Exam;

public class ProgramApp {

	public static void main(String[] args) {

		BsksExam exam = new BsksExam(10,10,10,10);
//		exam.setKor(10);
//		exam.setEng(10);
//		exam.setMath(10);
//		exam.setCom(10);
		System.out.println(exam.total());
		System.out.println(exam.avg());
	}
}

package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScannerExample {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScannerExample obj = new ScannerExample();
		obj.method1();
		
	}
	
	public void method2() {
		System.out.println("메소드 2");
	}
	public void method1() {
		System.out.println("국어 점수를 입력하세요 : ");
		String kor_str = sc.nextLine();
		int kor = Integer.valueOf(kor_str);
		
		System.out.println("영어 점수를 입력하세요 : ");
		String eng_str = sc.nextLine();
		int eng = Integer.valueOf(eng_str);
		
		System.out.println("수학 점수를 입력하세요 : ");
		String math_str = sc.nextLine();
		int math = Integer.valueOf(math_str);
		
//		System.out.println(kor);
//		System.out.println(eng);
//		System.out.println(math);
		
		int sum = kor +  eng + math;
		double avg = (double)sum/3;   //   sum/3.0; 해도됌
		System.out.println("총점은 : "+sum+" , 평균은 : "+avg);
		
		
		// 국영수 점수 입력 받아 int로 변환
		// 점수 종합 구하기
		// 평균 구하기
	}
}

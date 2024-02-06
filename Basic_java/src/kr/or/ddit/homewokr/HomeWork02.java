package kr.or.ddit.homewokr;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
	}

	public void method1() {
		/*
		 * 스캐너를 통해 숫자를 입력 받고 소수점 2째 자리에서 버림 ex) 12.23123 -> 12.23
		 */

		System.out.println("실수를 입력해 주세요.");
		double num = sc.nextDouble();
		num = num * 100;
		int result = (int) num;
		num = (double) result / 100;
		System.out.println("소수점 둘째 자리에서 버림한 값: "+num);
	}

	public void method2() {
		/*
		 * 스캐너를 통해서 소문자를 입력 받고 대문자로 변환 ex) a -> A
		 */
		// 1. str -> char
		// -32

		System.out.println("소문자를 입력하세요");
		String lowerCase_str = sc.nextLine();
		char lowerCase = lowerCase_str.charAt(0);

		char upperCase = (char) (lowerCase - 32);
		System.out.println(upperCase);

	}

	public void method3() {
		
		/*
		 * 스캐너를 통해서 대문자를 입력 받고 소문자로 변환 ex) F -> f
		 */
		System.out.println("대문자를 입력하세요");
		String upperCase_str = sc.nextLine();
		char upperCase = upperCase_str.charAt(0);

		char lowerCase = (char) (upperCase + 32);
		System.out.println(lowerCase);
	}

	public void method4() {
		/*
		 * 스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오. ex) 123 -> 1+2+3 = 6
		 */
		// charat(0)
		System.out.println("3자리 숫자를 입력하세요");
		String num = sc.nextLine();
		// char num1 = num.charAt(0);
		int num1 = (num.charAt(0) - 48);
		int num2 = (num.charAt(1) - 48);
		int num3 = (num.charAt(2) - 48);

		int sum = num1 + num2 + num3;

		System.out.println("각 자리수의 합은 : " + sum);
	}

	public void method5() {
		/*
		 * 스캐너를 통해서 숫자를 입력 받고 소수점 2째 자리에서 반올림 ex) 12.2623 -> 12.3 if문 안쓰고 *2하고 int로 변환
		 */
		System.out.println("숫자를 입력하세요 : ");
		double num = sc.nextDouble();
		num = num * 100;
		int iNum = (int) num; // int로 변환
		double dNum = num - iNum; // .xxx
		dNum = dNum * 2; // .xxx에 *2 해서 반올림 검사
		double cheak = iNum + (int) dNum; // int변환한거에 더하기 반올림검사한값
		num = (double) cheak / 100;

		System.out.println("소수점 둘째 자리에서 반올림한 값 : "+num);
	}

}

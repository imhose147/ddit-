package kr.or.ddit.study02.sec02;

public class CharExample {
	public static void main(String[] args) {
		// char : 부호 없는 2byte 정수(0~65535)
		
		char ch1 = 65;
		System.out.println(ch1);
		char ch2 = 'B'+32;  // 캐릭터 타입은 문자 하나만 표현 가능
		int i2 = ch2;
		System.out.println(ch2);
		System.out.println(i2);
	}

}

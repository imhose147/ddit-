package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
		
		// 정수형
		// 1) byte   : 1byte(127 ~ -128)
		// 2) short  : 2byte(32767 ~ -32768)
		// 3) int    : 4byte(2147483647 ~ -2147483648) 자바의 기본 정수형
		// 4) long   : 8byte(2^63-1 ~ -2^63) 데이터 끝에 L(l) 을 추가
		
		byte b1 = 127;
		System.out.println("b1 = " + b1);
//		byte b2 = 128;
		
		short s1 = 100;
		System.out.println("s1 = " + s1);
		
		short s2 = (short)(s1+100);  //정수가 기본형이므로  (short)를 앞에 붙여줘야함
		
		int i1 = 100;
		System.out.println("i1 = " + i1);
		int i2 = i1+100;
		
		int var1 = 200;    // 10진수
		int var2 = 0200;   // 8진수
		int var3 = 0x200;  // 16진수
		int var4 = 0b1101; // 2진수
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		long l1 = 10000000000000000L;
		long l2 = 1000;
	}

}

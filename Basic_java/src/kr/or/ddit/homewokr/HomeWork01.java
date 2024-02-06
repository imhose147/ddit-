package kr.or.ddit.homewokr;

public class HomeWork01 {
	public static void main(String[] args) {
		// 1년은 365.2422일이다.
		// 1년은 xxx일 x시간 x분 x초 입니다. 출력 할것
		// *24 *60 *60

		double year = 365.2422;
		
		int days = (int) year;
		
		year = (year-days)*24;
		int hour = (int)year;
		
		year = (year - hour)*60;
		int min = (int)year;
		
		year = (year - min)*60;
		int sec = (int)year;
		
		System.out.println(days + "일" + hour + "시" + min + "분" + sec + "초");
		
		
		//double hour = (year - 365) * 24;
		//double min = (hour - 5) * 60;
		//double sec = (min - 48) * 60;
		//System.out.println((int) year + "일" + (int) hour + "시간" + (int) min + "분" + (int) sec + "초");
	}

}

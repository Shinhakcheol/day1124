package method;

import java.util.Scanner;

public class IntTest {

	public static void main(String[] args) {
		
		System.out.println("날짜를 숫자8자리로 입력하세요.(ex 20201010)");
		
		Scanner in=new Scanner(System.in);
		int dateNum=in.nextInt();
		
		System.out.println(dateNum);
		int year=dateNum/10000;
		System.out.println("연 : "+year);
		
		dateNum%=10000;
		int month=dateNum/100;
		System.out.println("월 : "+month);
		
		dateNum %=100;
		System.out.println("일 : "+dateNum);
		
	}

}

package method;

public class Test03 {
	
	public static void main(String[] args) {
		int a=700;//새우깡가격
		int b=500;//돼지바가격
		int c=1000;//홈런볼가격
		
		int money=10000;//현재 있는돈
		
		int tot;
		
		int num1;
		int num2;
		int num3;
		
		//1.세우깡 700, 2.돼지바 500 , 3.홈런볼 1000
		//새우깡 2 돼지바 3 홈런볼 2
		
		num1=a*1;//새우깡
		num2=b*2;//돼지바
		num3=c*2;//홈런볼
		tot=money-num1-num2-num3;
		System.out.println("거스름돈"+tot);
		
		int oc=tot/5000;
		System.out.println("오천원 : "+oc);
		int ic=tot%5000/1000;
		System.out.println("천원 : "+ic);
		int ob=tot%5000%1000/500;
		System.out.println("오백원 : "+ob);
		int ib=tot%5000%1000%500/100;
		System.out.println("백원 : "+ib);
		
		
	}

}

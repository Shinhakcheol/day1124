package method;

public class Test04 {
	
	public static void main(String[] args) {
		
		int money=10000;
		
		int price[]= {700,500,1000};
		int ea[]= {1,2,2};
		
		int cost=0;
		for(int i=0;i<3;i++) {
			cost+=(price[i]*ea[i]);
		}
		System.out.println("구매비용 :"+cost+"원");
		int change=money-cost;
		System.out.println("거스름돈 :"+change+"원");
		
		int[] type= {5000,1000,500,100};
		
		int gEa;
		
		for(int i=0;i<4;i++) {
		gEa=change/type[i];
		System.out.println(type[i]+"원 :"+ gEa);
		change%=type[i];
		}
	}
		

}

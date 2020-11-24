package method;

import java.util.Scanner;

class AAA{
	//1.void 메서드이름(파라미터X){}
	public void display() {
		System.out.println("안녕하세요");
		System.out.println("메서드는 처음이지?");
		
	}
	//2.void 메서드이름(파라미터O){}
	public void display(String name) {
		System.out.println("안녕하세요 "+name+"님!");
		System.out.println("메서드는 처음이지?");
	}
	//3.리턴타입 메서드이름(파라미터X){}
	public int readInt() {
		Scanner in=new Scanner(System.in);
		System.out.print("정수입력");
		int inputData=in.nextInt();
		
		return inputData;
	}
	//4.리턴타입 메서드이름(파라미터O){}
	public int add(int n,int m) {
		return n+m;
			
	}
	public double div(int n,int m) {
		return (double)n/m;
	}
	
	
	
	
	
			
	
	
}

public class MethodTest02 {
	
	public static void disp() {
		System.out.println("aaaa");
	}
	public void no_static_disp() {
		disp();
	}
	

	public static void main(String[] args) {
		
		AAA aaa=new AAA();
		//aaa.display();
		//aaa.display("학철");
		//int result=aaa.readInt();
		//System.out.println(result);
		int result=aaa.add(10,20);
		System.out.println(result);
		
		aaa.div(10, 3);
		disp();
		//no_static_disp()
	}

}

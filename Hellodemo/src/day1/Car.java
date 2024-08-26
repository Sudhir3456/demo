package day1;

public class Car {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome sudhir");
		
		int a= 10;
		int b=20;
		int t;
		
		t=a;
		a=b;
		b=t;
				
		System.out.println("Swap of two number : a="+a);

		System.out.println("Swap of two number : b="+b);
		
		
		b=a-b+(a=b);
		

		System.out.println("Swap of two number : a="+a);

		System.out.println("Swap of two number : b="+b);

	}

}

package JavaPrograms;

import java.util.Scanner;

public class FibonacciRecur {
	static int a=0;
	static int b=1;
	static int c=0;
	public static void main(String[] args) {
		System.out.println("Enter terms: ");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(a+"\n"+b);
		FibonacciRecur obj=new FibonacciRecur();
		obj.fibon(num);	
	}
	int fibon(int n) {
		if(n>0) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		fibon(n-1);
		}
		return 1;
	}

}

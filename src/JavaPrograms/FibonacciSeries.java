package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int nm=0;
		System.out.println("Enter the term for Fibbonacci Series: ");
		Scanner num=new Scanner(System.in);
		nm=num.nextInt();
		System.out.println("Fibonnaci Series: ");
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<nm-1;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}

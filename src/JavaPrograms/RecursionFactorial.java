package JavaPrograms;

import java.util.Scanner;

public class RecursionFactorial {
static int fact=1;
	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter value for Factorial: ");
		int num=inp.nextInt();
		RecursionFactorial f=new RecursionFactorial();
		f.fac(num);
		System.out.println(fact);
	}
	void fac(int num) {
		if(num>=1) {
		fact*=num;
		fac(num-1);
		}
	}

}

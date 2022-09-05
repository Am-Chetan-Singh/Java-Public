package JavaPrograms;

import java.util.Scanner;

public class LimitlessPrimeNumber {

	public static void main(String[] args) {
		int nm=0;
		System.out.println("Enter Number : ");
		Scanner num=new Scanner(System.in);
		nm=num.nextInt();
		System.out.println("Prime number: ");
		for(int i=0;i<=100;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp++;
				}
			}
				if(temp==0)
					System.out.println(i);
		}
	}
}
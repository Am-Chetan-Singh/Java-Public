package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int nm=0;
		int temp=0;
		System.out.println("Enter Number : ");
		Scanner num=new Scanner(System.in);
		nm=num.nextInt();
		for(int i=2;i<=nm-1;i++) {
			if(nm%i==0)
			temp++;
		}
		if(temp==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}

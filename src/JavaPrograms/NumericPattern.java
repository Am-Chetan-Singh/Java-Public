package JavaPrograms;

import java.util.Scanner;

public class NumericPattern {

	public static void main(String[] args) {

		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		for(int i=1;i<=
				term;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print(j);//Replace i by j and vice-versa to get another pattern 
				
			System.out.println();
		}
	}

}

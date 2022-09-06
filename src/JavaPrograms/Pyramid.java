package JavaPrograms;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int term;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		term=d.nextInt();
		for(int i=0;i<=term;i++) {
			for(int j=term;j>=i;j--) 
				System.out.print(" ");
			
			for(int k=1;k<=i;k++) // Put k=0 and k<=(i*2) to similar as loop with l variable does
				System.out.print(" *");/*Remove space before * and ,
			then uncomment loop for l variable*/
			
			/*for(int l=0;l<=i;l++) 
				System.out.print("*");*/

			System.out.println();
		}
	}

}

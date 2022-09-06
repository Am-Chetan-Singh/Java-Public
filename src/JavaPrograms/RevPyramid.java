package JavaPrograms;

import java.util.Scanner;

public class RevPyramid {

	public static void main(String[] args) {
		int term;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		term=d.nextInt();
			for(int i=0;i<=term;i++) {
				for(int j=0;j<=i;j++) 
					System.out.print(" ");
				
				for(int k=term;k>=i;k--) 
					System.out.print(" *");/*Remove space before * and ,
											then uncomment loop for l variable 
				
				for(int l=term;l>i;l--) 
					System.out.print("*");*/

				System.out.println();
			}
		}

}

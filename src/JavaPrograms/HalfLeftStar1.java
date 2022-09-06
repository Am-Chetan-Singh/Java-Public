package JavaPrograms;

import java.util.Scanner;

public class HalfLeftStar1 {

	public static void main(String[] args) {
		int term=0,i,j;
		Scanner ar=new Scanner(System.in);
		System.out.println("Enter number of lines");
		term=ar.nextInt();
		for(int k=0;k<=term;k++) {
		
			for(i=term;i>=k;i--) 
				System.out.print(" ");
			
			for(j=0;j<=i;j++) 
				System.out.print("*");
			
			System.out.println();
		}
	}
}

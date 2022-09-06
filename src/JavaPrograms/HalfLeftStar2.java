package JavaPrograms;

import java.util.Scanner;

public class HalfLeftStar2 {

	public static void main(String[] args) {
		int term=0,i,j;
		Scanner ar=new Scanner(System.in);
		System.out.println("Enter number of lines");
		term=ar.nextInt();
		for(int k=0;k<=term;k++) {
		
			for(i=0;i<=k;i++) 
				System.out.print(" ");
			
			for(j=term;j>=i;j--) 
				System.out.print("*");
			
			System.out.println();
		}
	}

}

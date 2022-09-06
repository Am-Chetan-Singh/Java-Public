package JavaPrograms;

import java.util.Scanner;

public class RightArrow {
	public static void main(String[] args) {
		int term=0;
		Scanner ar=new Scanner(System.in);
		System.out.println("Enter number of lines");
		term=ar.nextInt();
		for (int i=0;i<term;i++){
			for (int j=0;j<=i;j++){
			System.out.print("*");	
			}
			System.out.println("");
		}
		for(int k=term-1;k>0;k--) {
			for(int l=k;l>0;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
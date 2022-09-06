package JavaPrograms;

import java.util.Scanner;

public class RightArrowLine {

	public static void main(String[] args) {
		int term=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter terms:");
		term=s.nextInt();
		for(int i=0;i<=term;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j)
				System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
		for(int i=term;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				if(i==j)
				System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}

}

}

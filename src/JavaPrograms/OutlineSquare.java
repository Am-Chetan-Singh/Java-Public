package JavaPrograms;

import java.util.Scanner;

public class OutlineSquare {

	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		for (int i=0;i<=term;i++) {
			for(int j=0;j<=term;j++) {
				if(i>0&&j>0&&i<term&&j<term)
					System.out.print(" ");
				
				else
					System.out.print("*");
			}System.out.println();
		}
	}

}

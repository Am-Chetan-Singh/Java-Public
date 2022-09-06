package JavaPrograms;

import java.util.Scanner;

public class Rev_V_Shape {

	public static void main(String[] args) {
		int term=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		term=s.nextInt();
		for(int i=0;i<=term;i++) {
			for(int j=term;j>=i;j--) 
				System.out.print(" ");
			
			for(int k=1;k<(i*2);k++) { 
			
				if(k>1&&k<(i*2)-1) 
				System.out.print(" ");
				
				else 
					System.out.print("*");
				
			}System.out.println();
		}
	}

}

package JavaPrograms;

import java.util.Scanner;

public class V_Shape {
	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		for(int i=term;i>0;i--) {
			for(int j=term;j>i;j--) 
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

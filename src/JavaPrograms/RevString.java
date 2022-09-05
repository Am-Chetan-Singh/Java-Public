package JavaPrograms;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		String name="";
		String revnm="";
		System.out.println("Enter Statement:");
		Scanner nms=new Scanner(System.in);
		name=nms.nextLine();
		int len=name.length();
		for(int i=len-1;i>=0;i--) 
			revnm=revnm+name.charAt(i);
		System.out.println("Reverse of Statement is : "+revnm);

	}

}

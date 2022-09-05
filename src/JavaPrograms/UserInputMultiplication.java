package JavaPrograms;

import java.util.Scanner;

public class UserInputMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int input = 0;
		        int res = 0;
		        Scanner inp = new Scanner(System.in);
		        System.out.println("Enter Number for which Multiplication needed: ");
		        input = inp.nextInt();
		        System.out.println("Multiplication of "+ input +" is :\n");
		        for (int i = 1; i <= 10; i++) {
		            res = input * i;
		            System.out.println(input+"*"+i+"="+res);
		        }
		    }
}

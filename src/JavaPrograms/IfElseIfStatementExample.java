package JavaPrograms;

public class IfElseIfStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=25;
		int weight=60;
		if(age>=18) {
			if(weight>=50) {
				System.out.println("Your are eligible to donate blood");
			}
			else {
				System.out.println("You are not eligilble to donate blood");
			}
		}
		else {
			System.out.println("Age restricted to 18 or more at the time of blood donation");
		}

	}

}

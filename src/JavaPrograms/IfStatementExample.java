package JavaPrograms;

public class IfStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		if(age>=18) {
			System.out.println("You are eligible to vote.");
		}
		if(age>18) {
			System.out.println("Your age is greater than 18.");
		}// this is skipped because the condition in if is not fulfilled
		if(age==18) {
			System.out.println("Your are 18 years old.");
		}
	}

}

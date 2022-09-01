package JavaPrograms;

public class WrapperSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age=18;
		switch(age) {
		case 15: System.out.println("You are Underage");
		break;
		
		case 18: System.out.println("You are at 18");
		break;
		
		case 65: System.out.println("You are Senior Citizen");
		break;
		
		default: System.out.println("Invalid Input!");
		}

	}

}

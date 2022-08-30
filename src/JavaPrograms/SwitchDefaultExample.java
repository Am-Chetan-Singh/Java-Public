package JavaPrograms;

public class SwitchDefaultExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=31;
		switch(i) {
		case 10:
			System.out.println("Value is 10");
			break;
		case 20:
			System.out.println("Value is 20");
			break;
		case 30:
			System.out.println("Value is 30");
			break;
		default: 
			System.out.println("Value is not 10, 20 or 30, the value is: \n\n" + i);
		}

	}

}

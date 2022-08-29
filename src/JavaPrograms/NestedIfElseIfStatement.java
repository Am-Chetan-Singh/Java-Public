package JavaPrograms;

public class NestedIfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="Kolkata,India";
		if(address.endsWith("India")) {
			if(address.contains("Delhi")) {
			System.out.println("Your City in India is: "+ address.split(",")[0]);
			}
			else if(address.contains("Mumbai")) {
			System.out.println("Your City in India is: "+ address.split(",")[0]);
			}
			else if(address.contains("Kolkata")) {
			System.out.println("Your City in India is: "+ address.split(",")[0]);
			}
			else if(address.contains("Chennai")) {
			System.out.println("Your City in India is: "+ address.split(",")[0]);
			}
		}
		else{
			System.out.println("Your City in India is: "+ address.split(",")[0]);
			}
	}

}

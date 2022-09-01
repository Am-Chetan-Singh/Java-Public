package JavaPrograms;

public class NestedSwitch {

	public static void main(String[] args) {
	
		int year=2;
		char branch='E';
		switch(year) {
		case 1:
			System.out.println("Common Papers");
			break;
		case 2:
			switch(branch) {
			
			case 'M': System.out.println("Mechanical Year 2");
			break;

			case 'E': System.out.println("Electrical Year 2");
			break;

			case 'C': System.out.println("CSE Year 2");
			break;
			}
			break;
		case 3:
			switch(branch) {
			case 'M': System.out.println("Mechanical Year 3");
			break;

			case 'E': System.out.println("Electrical Year 3");
			break;

			case 'C': System.out.println("CSE Year 3");
			break;
			}
			break;
		case 4:
			switch(branch) {
			case 'M': System.out.println("Mechanical Year 4");
			break;

			case 'E': System.out.println("Electrical Year 4");
			break;

			case 'C': System.out.println("CSE Year 4");
			break;
			}
			break;
		}
		
		}
		
	}


package JavaPrograms;

public class EnumSwitch {
	
	public enum day {Sun,Mon,Tues,Wed,Thurs,Fri,Sat}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day[] dayNow=day.values();
		for(day Now:dayNow) {
			switch(Now) {
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			case Tues:
				System.out.println("Tuesday");
				break;
			case Wed:
				System.out.println("Wednesday");
				break;
			case Thurs:
				System.out.println("Thursday");
				break;
			case Fri:
				System.out.println("Friday");
				break;
			case Sat:
				System.out.println("Saturday");
				break;
			
			}
		}

	}

}

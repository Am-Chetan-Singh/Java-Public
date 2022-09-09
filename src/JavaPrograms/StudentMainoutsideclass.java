package JavaPrograms;

public class StudentMainoutsideclass {
	int id;
	String name;

}

class TestStudent{
	public static void main(String[] args) {
		StudentMainoutsideclass s=new StudentMainoutsideclass();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}

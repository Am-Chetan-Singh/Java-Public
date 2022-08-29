package JavaPrograms;

public class SimpleForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"java","C","C++"};
		System.out.println("Printing the content of the array names: \n");
		for(String names:name) {// Here String is datatype, names is variable, value is passed from name array
			System.out.println(names);
		}
	}

}

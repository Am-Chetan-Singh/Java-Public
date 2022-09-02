package JavaPrograms;

public class LabeledForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa:
			for(int a=1;a<=3;a++) {
				bb:
					for(int j=1;j<=3;j++) {
						if(a==2&&j==2) {
							break aa;
						}
						System.out.println(a+" "+j);
					}
				}
		}
}

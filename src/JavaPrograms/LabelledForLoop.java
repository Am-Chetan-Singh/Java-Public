package JavaPrograms;

public class LabelledForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		a:
			for(int j=0;j<5;j++) {
			b:
				for(int k=j;k<10;k++) {
				c:
					for(int l=k;i<12;l++) {
						i++;
						System.out.println(i);
						if(l==3) {
							break a;
						}
					}			
				}
			}
	}
}

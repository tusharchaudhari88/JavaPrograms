
public class P1_PatternTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			System.out.println("");
		}
		
		//pattern 2
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println("");
		}
		
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
			}
			System.out.println("");
		}

	}

}

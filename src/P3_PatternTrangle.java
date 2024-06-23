/*
   *
   **
   ***
   **** 
   And 
   * 
  * * 
 * * * 
* * * * 
   
 */
public class P3_PatternTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=1 ;i<=n;i++) {
			
			for(int j=n-1;j>=1;j--) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//pattern 2
			for(int i=1 ;i<=n;i++) {
			
			for(int j=n-1;j>=i;j--) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}

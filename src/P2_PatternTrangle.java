

/*
    *
  ***
 *****
*******
 */
public class P2_PatternTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z= 1;
		int n=4;
		
		for(int i=1 ;i<=n;i++) {  //for row
			
			
			for(int j=n-1;j>=i;j--) {  // for space
				
				System.out.print(" ");
			}
			for(int k=1;k<=z;k++) {   // for print *
				
				System.out.print("*");  //try to keep i and k 
			}
			z=z+2;
			System.out.println("");
		}

	}

}


public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =454;
		int reminder = 0;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			
			reminder = n%10;  //4 //5 / 4
			
			sum = (sum*10)+reminder;  //4 //45 //454
			
			n= n/10;   //45 //4
			
		}
		
		if(temp==sum) {
			
			System.out.println("Number is palindrom  " );
		}
		else {
			
			System.out.println("Number is not Palindrom");
		}
	}

}

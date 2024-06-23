
public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		boolean isPrime = true;
		
		for(int i=2;i<num;i++) {
			
			if(num%2==0) {
				
				isPrime =false;
				break;
			}
		}

		if(isPrime) {
			
			System.out.println("number is prime");
		}
		else {
			
			System.out.println("number is not prime");
		}
	}

}

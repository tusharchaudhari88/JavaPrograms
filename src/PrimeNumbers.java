
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int flag = 0;
		int sum = 0;
		
		for(int i=1;i<100;i++) {
			
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					flag = 0;
					break;
				}
				else {
					flag = 1;
				}		
		}
		if(flag == 1) {
			
			System.out.println("Prime number are "+i);
			sum = sum +i;
			}	
		}
		System.out.println("sum of prime number is "+sum);
	}
}

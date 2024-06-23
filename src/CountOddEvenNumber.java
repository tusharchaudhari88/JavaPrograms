
public class CountOddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<100;i++) {
			
			if(i%2==0) {
				
				even++;
			}
			else {
				
				odd++;
			}
		}
		System.out.println("count for even numner is "+even +" and odd number is "+odd);

	}

}

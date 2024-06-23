
public class ContiniousSubArray {

	// Program to find continuous subarray which addition is equal to 6
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,2,3,3,7,2,4};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {	
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				
				sum = sum+arr[j];
				if(sum==6) {
					
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}


public class LargestSumContinuousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,-3,-4,0,6,7,8,9};
		
		int sum = 0;
		int max_sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
			
			if(sum > max_sum) {
				
				 max_sum =sum;
			}
			if(sum < 0) {
				
				sum = 0;
			}
			
		}
		
		System.out.println(max_sum);

	}

}

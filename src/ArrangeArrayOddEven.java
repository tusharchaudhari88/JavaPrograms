import java.util.Arrays;

public class ArrangeArrayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,19,4,7,9,11};
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {       //for even number
			
			if(arr[i]%2 == 0 ) {
				
				arr[count++] = arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {       //for odd number
			
			if(arr[i]%2 !=0 ) {
				
				arr[count++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}

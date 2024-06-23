import java.util.Arrays;

public class MoveAllZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,0,2,5,0,6,4,0};
		int length = arr.length;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] !=0) {
				
				arr[count++] = arr[i];
			}
		}
		while(count < length) {
			
			arr[count++] =0;
		}
	
		System.out.println(Arrays.toString(arr));
	}

}

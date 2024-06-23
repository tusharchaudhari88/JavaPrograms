import java.util.Arrays;

public class ArrangeArrayElement {

	//segrigate all 0 on left side and all is on right side
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,0,1,0,1,0};
		int count = 0;
		int length = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == 0) {
				
				arr[count++] = arr[i];  // keeping 0
			}
			
		}
		
		 while(count<length) {
		 
		  arr[count++] = 1; //keeping 1
		 
		  }
		 
		System.out.println(Arrays.toString(arr));

	}

}

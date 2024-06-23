import java.util.Arrays;

public class AddOneNumberInArray {
	
  public static void main(String[] args) {
	  
	  int [] arr = {4,9,9};
	   	 	
	  int n = arr.length;
	  for(int i=n-1;i>=0;i--) {
		   	 	
		  if(arr[i]<9) {
			  
			  arr[i] = arr[i]+1;
		  } 	 	 
		  else {
			  
			  arr[i] = 0;
		  }
	  } 
	  System.out.println("addition is "+ Arrays.toString(arr));
	 
	  // if number is 999
	  int[] new_arr = new int[n+1] 	;
	  new_arr[0] =1;
	  System.out.println("addition is "+ Arrays.toString(new_arr));
  }

}

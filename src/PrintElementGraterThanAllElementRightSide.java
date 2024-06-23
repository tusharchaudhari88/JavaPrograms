
public class PrintElementGraterThanAllElementRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,18,1,2};
		
		for(int i=0;i<arr.length-1;i++) {
			
			boolean flag=true;
			
			for(int j=i+1;j<arr.length-1;j++) {
				
				if(arr[i] < arr[j]) {
					
					flag=false;
				}
			}
			if(flag) {
				
				System.out.println(arr[i]);
			}
		}
		

	}

}

import java.util.Arrays;

public class SecondElementGreaterThanItsLeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1,2,4,9,5,3,7,8,7,10,12,14};
		
		Arrays.sort(myArray);
		
		System.out.println("Array after sorting "+Arrays.toString(myArray));
		
		//Array after sorting [1, 2, 3, 4, 5, 7, 7, 8, 9, 10, 12, 14]
		
		for(int i=1;i<myArray.length;i++) {
			
			if(i %2 ==0) {
				
				int temp = myArray[i];
				 myArray[i] =myArray[i-1];
				 myArray[i-1] = temp;
			}
		}
		System.out.println(" Second Element Greater Than Its Left Right" +Arrays.toString(myArray));

	}

}

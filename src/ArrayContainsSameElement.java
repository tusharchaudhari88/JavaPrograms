import java.util.Arrays;

public class ArrayContainsSameElement {
	
	public static void main(String[] args) {
		
		 	int[] obj1= {2,5,8,1};
		 	int[] obj2= {1,5,8,2};
		 	
		 	Arrays.sort(obj1);
		 	Arrays.sort(obj2);
		 	
		 	boolean test = Arrays.equals(obj1, obj2);
		 	System.out.println("Integer Arrays are equal ?   "+ test);
		 	 	 	 	 	 													 	 				 	 	 	 	 					 	
	// To check strings contains same elemenets 	 	
		 	String s1 = "ABC";
		 	String s2 = "BACD";
		 	
		 	Object[] ch1 = s1.split("");
		 	Object[] ch2 = s2.split("");
		 	
		 	Arrays.sort(ch1);
		 	Arrays.sort(ch2);
		 	boolean result= Arrays.equals(ch1,ch2);
		 	System.out.println("Strings are equal ?   "+ result);
	}

}


public class PermutationCombinationOfString {
	
	public static void permutation(String s, String result) {
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			String left_String = s.substring(0,i);
			String right_String =s.substring(i+1);
			String rest = left_String +right_String;
			permutation(rest,result+ch);
		}
		
		if(s.length() == 0) {
			
			System.out.println(result+"");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abc";
		String result = "";
		
		permutation(s,result);

	}

}

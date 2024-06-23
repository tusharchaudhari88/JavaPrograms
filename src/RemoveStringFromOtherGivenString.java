
public class RemoveStringFromOtherGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gstr = "The quick browen fox";
		
		System.out.println(gstr);
		
		String maskStr = "queen";
		System.out.println(maskStr);
		
		String result ="";
		
		for(int i=0;i<gstr.length();i++) {
			
			char ch = gstr.charAt(i);        // Conerting String to Char
			
			String st =String.valueOf(ch);   // converting Char To String
		
			if(!maskStr.contains(st)) {
				
				result = result + st;
			}
		}
		System.out.println(result);
		

	}

}


public class RemoveDublicateWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "INDIA";
		
		String result = "";
		
		for(int i=0;i<s.length();i++) {
			
			char ch  =s.charAt(i);         // String to char 
			
			String st = String.valueOf(ch); // char to String
			
			// 	String st = "" + s.charAt(i);  
			
			if(result.contains(st)) {
				
				continue;
			}
			else {
				
				result = result+st;
			}
		}
		System.out.println("After removing dublicate Char "+result);
	}

}


public class UniqueCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "good";
		
		for(int i=0;i<st.length();i++) {
			
			int count = 1;
			
			for(int j=0;j<st.length();j++) {
				
				if(st.charAt(i)==st.charAt(j) && i !=j) {
					
					count++;
					break;
				}
			}
			if(count == 1) {
				
				System.out.println(" non reapeating char is "+st.charAt(i));
				
			}
		}

	}

}

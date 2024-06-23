
public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Tushar Chaudhari";
		
		String[] arr = st.split(" ");
		
		String temp = "";
		
		for(int i=0;i<arr.length;i++) {
			
			temp = arr[i];
			String result = "";
			
			for(int j=temp.length()-1;j>=0;j--) {
				
				result = result+temp.charAt(j);
			}
			result =result+" ";
			System.out.print(result);
		}
		
	}

}

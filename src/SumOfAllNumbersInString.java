
public class SumOfAllNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "It 15 is 35 String";
		
		char[] ch = st.toCharArray();
		
		int sum =0;
		String temp="0";
		
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isDigit(ch[i])) {
				
				temp = temp+ch[i];
			}
			else {
				
				sum = sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum);
	}

}

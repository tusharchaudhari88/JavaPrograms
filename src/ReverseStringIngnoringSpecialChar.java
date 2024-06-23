
public class ReverseStringIngnoringSpecialChar {
	
	public static void reverse(char [] ch) {
		
		//intialize left and right point
		
		int r= ch.length-1;
		int l = 0;
		
		//trancese string from both end until l and r
		while(l <r) {
			
			//ignore special character
			if(!Character.isAlphabetic(ch[l])) {
				
				l++;
			}
			else if(!Character.isAlphabetic(ch[r])) {
				
				r--;
			}
			//both ch[l] and ch[r] are not special
			else {
				
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] =temp;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a!!b.c.d.e,f,ghi";
		
		char[] ch = str.toCharArray();
		System.out.println("Input string is "+str);
		
		reverse(ch);
		
		String reverseString = new String(ch);
		System.out.println(reverseString);

	}

}

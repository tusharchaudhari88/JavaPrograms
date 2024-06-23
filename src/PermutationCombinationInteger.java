
public class PermutationCombinationInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				for(int k=0;k<=3;k++) {
					
					if(i !=j && j!=k && k!=i) {
						
						count++;
						System.out.println(i+" "+" " +j +" "+k);
					}
				}
			}
		}
		System.out.println("count is" +count);
	}

}

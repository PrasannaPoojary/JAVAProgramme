package string;

public class AddSum {
	public static void main(String[] args) {
		String s="@1$b25";
		int sum=0;
		for(int i=0; i<s.length(); i++) 
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int n= s.charAt(i);	
				sum=sum+n;
			}
			
		System.out.println(sum);
			 
			
			
			
		}
	}
	

}

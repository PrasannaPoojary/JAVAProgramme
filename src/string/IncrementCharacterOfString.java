package string;

public class IncrementCharacterOfString {
	public static void main(String[] args)
	{
		String s ="India";
		String  temp ="";
		for(int i=0; i<s.length(); i++) 
		{
			temp= temp+s.charAt(i);
			System.out.println(temp);
			
		}
		
	}
	

}

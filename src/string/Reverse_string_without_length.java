//set2
package string;

public class Reverse_string_without_length {
	public static void main(String[] args) {
	
		String s ="java";
		String reverse ="";
		
		char[] ch = s.toCharArray();
		int count =0;
		for(char c :ch) 
		{
			count++;
			
		}
		for(int i =count-1; i>=0; i--)
		{
			reverse= reverse+s.charAt(i);
		}
		System.out.println(reverse);
		

}
}
//set3
package string;
import java.util.LinkedHashSet;

public class NumberOfOccurOfCharInString {
	public static void main(String[] args) {
		String s= "managoahhah";
				
		//step1
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) 
		{
			set.add(s.charAt(i));
			
		}
		System.out.println(set);
		
		for(Character ch:set) 
		{
			//step2
			int count =0;
			
			for(int i=0; i<s.length(); i++) 
			{
				if(ch==s.charAt(i))
				{
				//step3
					count++;
				}
			}
		   //step 4
			System.out.println(ch + " "+count);
		}
	}

}
package string;

import java.util.LinkedHashSet;

public class FindThePositionOfTheCharacterInAGivenString {
	public static void main(String[] args) {
			String str= "Tester";
			String s =str.toLowerCase();
		
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
						System.out.println(ch + " "+ (i+1) );
						break;
					}
				}
			   //step 4
			
			}
	}

}

//set3
package string;

import java.util.LinkedHashSet;

public class Remove_Duplicates_from_the_given_string {
	public static void main(String[] args) {
		String s= "india";
		//step1
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) 
		{
			set.add(s.charAt(i));
			
		}
		System.out.println(set);
		for(Character ch:set) 
		{
			System.out.print(ch);
			
		}
}


}

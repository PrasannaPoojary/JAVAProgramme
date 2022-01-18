package word;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Word_From_the_Given_String {
	public static void main(String[] args) {
		String s= "WELCOME TO banglore WELCOME TO banglore fgg";
		String [] str = s.split(" ");
		//step1
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) 
		{
			set.add(str[i]);
			
		}
		System.out.println(set);
		
		for(String ch:set) {
		System.out.println(ch);
		}
	}	
}
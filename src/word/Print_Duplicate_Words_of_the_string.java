package word;

import java.util.LinkedHashSet;

public class Print_Duplicate_Words_of_the_string {
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
		
		for(String ch:set) 
		{
			//step2
			int count =0;
			
			for(int i=0; i<str.length; i++) 
			{
				if(ch.equals(str[i]))
				{
				//step3
					count++;
				}
			}
			if(count>1) {
		 
			System.out.println(ch + " "+count);
			}
		}
	}
}


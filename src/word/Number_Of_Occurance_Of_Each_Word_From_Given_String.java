
package word;

import java.util.LinkedHashSet;

public class Number_Of_Occurance_Of_Each_Word_From_Given_String {                            

	public static void main(String[] args) {
		String s= "WELCOME TO TYSS to TO TYSS";
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
		   //step 4
			System.out.println(ch + " "+count);
		}
	}
}

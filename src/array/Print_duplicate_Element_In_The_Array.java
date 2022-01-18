package array;

import java.util.LinkedHashSet;

public class Print_duplicate_Element_In_The_Array {
	public static void main(String[] args) {
		
			int a[] ={1,5,6,4,8,7,9,5,6,};
			//step1
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			for(int i=0; i<a.length; i++) 
			{
				set.add(a[i]);
			}
			System.out.println(set);
			for(Integer n:set) 
			{
				int count =0;
				for(int i=0; i<a.length; i++;)
				{
					
				{
					count++;
				}
				}
			}
	}
	}

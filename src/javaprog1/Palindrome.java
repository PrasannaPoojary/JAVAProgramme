package javaprog1;

public class Palindrome {
	public static void main(String[] args) {
		 int num=142,rem,sum=0,temp =num; 
		while(num>0) {
		 rem =num%10;
		 num=num/10;
		 sum  =(sum*10)+rem;
		}
		  if(sum==temp)
		  {
			  System.out.println(temp +" is palindrome");
		  }
		  else
		  {
			  System.out.println(temp +" is not  palindrome");
		  }
	}
	
	
	
	
	
	
	
	
	
	

}

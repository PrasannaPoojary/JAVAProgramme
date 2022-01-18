package javaprog1;

public class Primenumber {
	
	public static void main(String[] args) {
    int i, num = 1, count; 
	
	System.out.println(" Prime Numbers from 1 to 100  ");	
	
	while(num <= 100)
	{
		count=0;
		i = 1;
	    while(i <= num )
	    {
	    	if(num % i == 0)
	    	{
	    		count++;
	    	}
	    	i++;
	    }
	    if(count == 2 )
	    {
	    	System.out.print(num + " ");
	    }
		num++;
	}
}
}

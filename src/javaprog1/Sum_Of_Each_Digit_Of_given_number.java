package javaprog1;

public class Sum_Of_Each_Digit_Of_given_number {
	public static void main(String[] args) {
	int	number =2234,rem,sum=0;
	while(number>0) 
	{
		rem =number%10;
		sum=sum+rem;
		number =number/10;
		
	}
	System.out.println("Sum of Each digit of given number is  ="+sum);
	}

}

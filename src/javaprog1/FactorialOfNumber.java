package javaprog1;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int sum=1, n=10;
		for(int i =1; i<=n; i++) {
			sum =sum*i;
		}
		System.out.println("Factorial of "+n + " is "+sum);
	}

}

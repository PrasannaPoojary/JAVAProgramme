package array;

public class Print_array_in_ascending_order {
	public static void main(String[] args) 
	{
		int a[] = {20,10,30,50,40};
				
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] =a[j];
					a[j] =temp;
				}
			}
		}
			for( int k=0; k<a.length; k++)
			{
				System.out.print(a[k]+ " ");
			}
		
	}

}

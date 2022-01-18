package array;

public class Segregate_Zeroes_Right_Side {
	
	public static void main(String[] args) {
		int a[] = {0, 1, 0,3,0,4,6,0,0,3,6};
		int b[] =  new int[a.length];
		int n= a.length-1;
		int m=0;
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i]==0)
			 {
				 b[n]=a[i];
				 n--;
			 }
			 else
			 {
				 b[m] =a[i];
				 m++;
			 }
		 }
			 for(int i=0; i<b.length; i++)
			 {
				 System.out.print(b[i]+" ");
			 }
		 }
	}



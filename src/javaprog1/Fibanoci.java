package javaprog1;

public class Fibanoci {
	 public static void main(String[] args) {

		    int n = 5, a = 0, b = 1;
		    System.out.println("First 5 fibanoci series");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(a + ", ");
		      int c = a + b;
		      a= b;
		      b = c;
		    }
		  }
		}
	


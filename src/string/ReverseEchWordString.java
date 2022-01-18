package string;

public class ReverseEchWordString {
	public static void main(String[] args) 
	{
		String s="welcome to tyss";
		String[] str = s.split(" ");
		 String rev ="";
		 for( int i=str.length-1;i>=0; i--) {
			 rev = rev+str[i]+" ";
		 }
	 
		 System.out.println(rev);

}
}
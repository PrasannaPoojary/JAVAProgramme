package string;

public class Reverse_string_using_third_variable {
	public static void main(String[] args) {
    String s= "game";
    String reverse= "";
		
		for(int i =s.length()-1; i>=0; i-- )
		{
			 reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);

}
}
	
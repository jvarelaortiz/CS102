
public class palindrome {

	public static void main(String[] args) 
	{
		 String str = "madam";
		 String str2 = "test";
		 String rev = "";
		 String rev2 = "";
		 char c;

		 for (int i = 0; i < str.length(); i++)
	      {
	        c = str.charAt(i); 
	        rev = c + rev; 
	      }
		 System.out.println("Reversed word: "+ rev);
		 
		 for (int n = 0; n < str2.length(); n++)
	      {
	        c = str2.charAt(n);
	        rev2 = c + rev2; 
	      }
		 
		 System.out.println("Reversed wor2d: "+ rev2);
		 
		 if(str.equals(rev))
		 {
			 System.out.println("Madam is a palindrome"); 
			 
		 }
		 else
		 {
			 System.out.println("Madam is not a palindrome");
			 
		 }
		 
		 if(str2.equals(rev2))
		 {
			 System.out.println("Test is a palindrome");
			 
		 }
		 else
		 {
			 System.out.println("Test is not a palindrome");
			 
		 }
		 		 
		 System.out.println();
		 
		 
	}

}

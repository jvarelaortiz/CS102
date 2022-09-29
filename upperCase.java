
public class upperCase {

	public static void main(String[] args) 
	{

		String text = "hello everyone. let's write some useful Java code today. we will begin with strings.";
		
		
		String[] sentence = text.split("\\.");
		
		String str1 = sentence[0];
		String str2 = sentence[1];
		String str3 = sentence[2];
		
		
		String output1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
		String output2 = str2.substring(0, 2).toUpperCase() + str2.substring(2);
		String output3 = str3.substring(0, 2).toUpperCase() + str3.substring(2);
		
	    System.out.println("Str1:  " + output1.trim());
	    System.out.println("Str2:  " + output2.trim());
	    System.out.println("Str3:  " + output3.trim());
	    
	}

}

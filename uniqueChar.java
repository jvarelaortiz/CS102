
public class uniqueChar {

	public static void main(String[] args) {
		String str = "Saba";
		String str2 = "John";

		
		boolean isUnique = false;
		boolean isUnique2 = false;
		
		
		for (int i = 0; i < str.length(); i++)
		{
	        for (int j = i + 1; j < str.length(); j++)
	        {
	            if (str.charAt(i) == str.charAt(j))
	            {
	                isUnique = false;
	            }
	        }
		}

	    
	    isUnique = true;

		
	    if (isUnique)
	    {
	    	 System.out.println("String 1: True ");	   
	    }
	    else 
	    {
	    	 System.out.println("String 1: False ");
	    }
	    
	    if (isUnique2)
	    {
	    	 System.out.println("String 2: True ");	   
	    }
	    else 
	    {
	    	 System.out.println("String 2: False ");
	    }
	    
	    

	}
	
	
	

}

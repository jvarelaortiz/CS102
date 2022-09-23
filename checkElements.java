
public class checkElements {
	
	public static void main(String[] args) {
		
		int[] array0 = new int[]{ 1,77,-5,2,65,30 };
		int[] array1 = new int[]{ -10,50,15,2,77 };
		int c1 = 0;
		int c2 = 0;
		int check = 0;
		
		
		
		for(int i = 0; i < array0.length; i++)
		{
			c1 = array0[i];
			 if(c1 == 65)
			 {
				 check++;
			 }
			 else if(c1 == 77)
			 {
				 check++;
			 }
			
		}
		
		if (check == 2)
		{
			System.out.println("Array0 contains 65 and 77");
		}
		
		if (check != 2)
		{
			System.out.println("Array0 does not contain 65 and 77");
		}
		
		check = 0;
		
		for(int n = 0; n < array1.length; n++)
		{
			c2 = array1[n];
			
			if(c2 == 65)
			 {
				 check++;
			 }
			 else if(c2 == 77)
			 {
				 check++;
			 }
			
		}
		
		if (check == 2)
		{
			System.out.println("Array1 contains 65 and 77");
		}
		
		if (check != 2)
		{
			System.out.println("Array1 does not contain 65 and 77");
		}
		
		
	}

}

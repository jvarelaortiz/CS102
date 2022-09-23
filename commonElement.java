
public class commonElement {

	public static void main(String[] args) {
		int[] array0 = new int[]{ 1,5,-5,2,12,30 };
		int[] array1 = new int[]{ -10,50,15,2 };
		
		int c1 = 0;
		int c2 = 0;
		int common_elements = 0; 
		
		for(int i = 0; i < array0.length; i++)
		{
			c1 = array0[i];
			
			for(int n = 0; n < array1.length; n++)
			{
				c2 = array1[n];
				
				if(c2 == c1)
				{
					common_elements = c2;
					
				}
				
			}
		}
		System.out.print("common_elements: " + common_elements);
		
	}

}

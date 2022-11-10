import java.util.Arrays;
import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter number of disks: ");

	    int numOfDisks = myScanner.nextInt();  // Read user input
	    System.out.println("");
		towerOfHanoi(numOfDisks, "A", "B", "C", "D");
		
		System.out.println("=============================");
		
		int[] arr = { 3, 2, 5, 6, 1, 4 };
		MergeSort(arr);
		
		

	}
	
	static void towerOfHanoi(int numOfDisks, String from, String helper, String helper2, String to)
	{
		if(numOfDisks == 0)
		{
			return;
		}
		
		towerOfHanoi(numOfDisks - 1, from, helper, helper2, to);
		System.out.println("Move disk " + numOfDisks + " from " + from + " to " + to);
		towerOfHanoi(numOfDisks - 1, helper, to, helper2, from);
	}

	static int factorial(int n)
	{
		int result = 1;
		
		for(int i = 1; i <= n; i++)
		{
			result = result * i;
		}
		return result;
	}
	
	static int factorial_recursive(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * factorial(n-1);
	}

	
	
	static void MergeSort(int[] arr) 
	{
        int n = arr.length;
 
        int[] s1= new int[(n + 1)/2];
        int[] s2= new int[n - s1.length];
		
        for (int i = 0; i < n; i++)
        {
            if (i < s1.length) {
                s1[i] = arr[i];
            }
            else {
                s2[i - s1.length] = arr[i];
            }
        }
 
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        
        for (int i = 0; i < s1.length; i++) 
        {
            for (int j = i + 1; j < s1.length; j++) 
            {
                int temp = 0;
                if (s1[i] > s1[j]) 
                {
                    temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < s2.length; i++) 
        {
            for (int j = i + 1; j < s2.length; j++) 
            {
                int temp2 = 0;
                if (s2[i] > s2[j]) 
                {
                   temp2 = s2[i];
                   s2[i] = s2[j];
                    s2[j] = temp2;
               }
            }
        }
        
        int size1 = s1.length;
        int size2 = s2.length;
        
        int size = size1 + size2;
        
        int arr2[] = new int[size];
        
        System.arraycopy(s1, 0, arr2, 0, size1);
        System.arraycopy(s2, 0, arr2, size1, size2);
        
       
        
        for (int i = 0; i < arr2.length; i++) 
        {
            for (int j = i + 1; j < arr2.length; j++) 
            {
                int temp3 = 0;
                if (arr2[i] > arr2[j]) 
                {
                   temp3 = arr2[i];
                   arr2[i] = arr2[j];
                    arr2[j] = temp3;
               }
            }
        }
         
        System.out.println(Arrays.toString(arr2));
		
	}
}

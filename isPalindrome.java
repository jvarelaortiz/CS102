
//Was very confused on how to work with stack. Used online resources to help me find some code for working with the stack. Not sure if this falls under the **plagiarism** section submitting anyways. If it does count as plagiarism then dont count this file as valid.

public class isPalindrome {

	static char []stack;
	static int top = -1;
	 
	 
	static int isPalindrome(String str)
	{
	    int length = str.length();
	    stack = new char[length * 4];
	 
	    int i; 
	    int mid = length / 2;
	 
	    for (i = 0; i < mid; i++)
	    {
	        push(str.charAt(i));
	    }

	    if (length % 2 != 0)
	    {
	        i++;
	    }
	 
	
	    for (int n = i; n < length; n++)	    
	    {
	        char c = pop();
	 
	      
	        if (c != str.charAt(n))
	        {
	            return 0;
	        }
	    }
	 
	    return 1;
	}
	
	static void push(char c)
	{
	    stack[++top] = c;
	}
	 
	static char pop()
	{
	    return stack[top--];
	}
	
	public static void main(String[] args)
	{
	    String str = "madam";
	 
	    if (isPalindrome(str) == 1)
	    {
	        System.out.printf("Yes");
	    }
	    else
	    {
	        System.out.printf("No");
	    }
	}
	
}



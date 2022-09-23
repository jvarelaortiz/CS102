
public class reverseArray {

	public static void main(String[] args) {
		char[] array0 = new char[]{ 's', 'a', 'b', 'a' };
		int len = array0.length;

		    if (len == 0)
		        return;

		    for (int i=0; i < (len/2); i++)
		    {
		        char l = array0[i];
		        array0[i] = array0[len-i-1];
		        array0[len-i-1] = l;
		    }

		    System.out.println(array0);

	}

}

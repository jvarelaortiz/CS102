import java.util.LinkedList;
import java.util.Queue;

public class minQueue {

	public static void main(String[] args) {
		
		 Queue<Integer> q = new LinkedList<>();
		 
		 int temp;
		 

     for (int i = 5; i > 0; i--)
     {
         q.add(i);
     }
     
     int min = q.element();
     int size = q.size();
     
     for (int n = 0; n < size; n++)
     {
         temp = q.element();
         
         if(temp < min)
         {
        	 min = temp;
         }
         q.remove();
     }
     
     System.out.println("Min = " + min);

	}
	
	
	

}

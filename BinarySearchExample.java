
class BinarySearchExample{
	
	 public static void binarySearch(int arr[], int first, int last, int key){
	   
		 int mid = (first + last)/2; // creates variable mid wich is the middle element
		 
	   while( first <= last )// while loop to search for the key
	   {
	      if ( arr[mid] < key )//if the middle element of the array is less than key
	      {
	        first = mid + 1;   //increase the first element
	      }else if ( arr[mid] == key )//mid element equal to key
	      {
	        System.out.println("Element is found at index: " + mid);//then the key has been found
	        break;
	      }else
	      {
	         last = mid - 1;// decrease last
	      }
	      mid = (first + last)/2; // new mid value to continue searching
	   }
	   if ( first > last )// check to see if all elements have beens searched
	   {
	      System.out.println("Element is not found!");//it was not found
	   }
	 }
	 public static void main(String args[])
	 {
			int arr[] = {10,20,30,40,50};//the array to search
			int key = 30;//item to find
	        int last=arr.length-1;//end of the array
			binarySearch(arr,0,last,key);	//run the program
	 }
	}

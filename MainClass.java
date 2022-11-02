
public class MainClass {

	public static void main(String[] args) 
	{
		User user01 = new User("Juan", "Peoria");
		user01.tweet("Hello Everyone! This is my first tweet!").display();
		

		User user02 = new User("David");
		user02.tweet("Hello Everyone! This is David!").display();
		
		User user03 = new User("Varela", "Chicago");
		user03.tweet("Such a beautiful day in Chicago today!").display();
		
		user02.tweet("I wish I could get some pizza right now!").display();
		
	}

}

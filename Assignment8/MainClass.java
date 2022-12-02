
public class MainClass {

	public static void main(String[] args) {
		BST tree = new BST();
        
		//Create tree
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(7);
 
        // Display 
        tree.display();
        
        System.out.println("--------------------------");
      //Delete node
        tree.delete(3);
      
 
        // Display new tree
        tree.display();
        
        System.out.println("--------------------------");
        
        tree.head();
        
	}

}

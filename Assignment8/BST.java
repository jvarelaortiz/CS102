

public class BST 
{
    Node root;

    //storing the children of nodes
    class Node 
    {
        int key;
        Node left, right;
        
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    } 
    
   
    BST() 
    { 
    	root = null; 
    }
 
    BST(int value) 
    { 
    	root = new Node(value); 
    }
 
    // This method mainly calls deletionLoop()
    void insert(int key) 
    { 
    	root = insertionLoop(root, key); 
    }

    Node insertionLoop(Node root, int key)
    {
 
        //initial node
        if (root == null) 
        {
            root = new Node(key);
            return root;
            
        }else if (key < root.key)//populating the left
        {
            root.left = insertionLoop(root.left, key);
        }else if (key > root.key)
        {
            root.right = insertionLoop(root.right, key);//populating the right
        }
 
        
        return root;
    }
 
    
    //delete is modified insert
    void delete(int key) 
    { 
    	root = deletionLoop(root, key); 
    }

    Node deletionLoop(Node root, int key)
    {
 
        //empty tree means do nothing
        if (root == null) 
        {
            return root; 
            
        }else if (key < root.key)//deleting the left
        {
            root.left = deletionLoop(root.left, key);
        }else if (key > root.key)
        {
            root.right = deletionLoop(root.right, key);//deleting the right
        }else
        {
        	 if (root.left == null)
        	 {
        		 return root.right;
        	 }
             else if (root.right == null)
             {
            	 return root.left;
             }
        	 
        	 root.key = minimumValue(root.right);
        }
        	
 
        
        return root;
    }
    
    int minimumValue(Node root)
    {
        int min = root.key;
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }
    //display functions
    void display() 
    { 
    	displayLoop(root);//call display Loop 
    }
    void displayLoop(Node root)//Couldn't get it to look pretty and formatted
    {
        if (root != null) 
        {
        	System.out.println(root.key);//prints node
            displayLoop(root.left);//prints left 
            
            displayLoop(root.right);//prints right
        }
 
    }
    void head() 
    { 
    	head2(root);//call display Loop 
    }
    int head2(Node root)
    {
    	
    	return root.key;
    }
}
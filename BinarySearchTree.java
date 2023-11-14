package bst;
import java.util.Scanner;



class Node
{
	int data;
	Node left,right;
	
	public Node(int element) {
		data = element;
		left=right=null;
	}
}
public class BinarySearchTree
	{
		
	Node root;
		
		BinarySearchTree(){
			root=null;
		}
		
		Node insert(Node node ,int element)
		{
			if(node==null) {
				node = new Node(element);
				return node;
			}
			
			if ( element< node.data)
	            node.left = insert(node.left, element);
	        else if (element > node.data)
	            node.right = insert(node.right, element);
	 
	        // Return the (unchanged) node pointer
	        return node;
	    
		}
		Node search(Node root, int key) {
	        // Base Cases: root is null or key is present at root
	        if (root == null || root.data == key) {
	        	System.out.println("Element found."+ root.data);
	        	return root;
	        }
	        // Key is greater than root's key
	        if (root.data < key)
	            return search(root.right, key);
	 
	        // Key is smaller than root's key
	        return search(root.left, key);
	    }

		 public static void printPreOrder(Node node) 
		 {
			if(node==null) 
				return;
			
			System.out.println(node.data);
			printPreOrder(node.left);
			printPreOrder(node.right);
	 }
		 public static void printPostOrder(Node node)
		 {
				if(node==null) 
					return;
				
				printPreOrder(node.left);
				printPreOrder(node.right);
				System.out.println(node.data);
		 }
		 public static void printInOrder(Node node) 
		 {
				if(node==null) 
					return;
				
				printPreOrder(node.left);
				System.out.println(node.data);
				printPreOrder(node.right);
				
		 }
		 
	 }	 
	

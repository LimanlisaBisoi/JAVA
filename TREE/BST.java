//Binary Search Tree

import java.util.*;
//Insertion/Building a Binary Search Tree

public class BST {
    class Node{
        int key;
        Node left, right;
 
        public Node(int item){
        	key= item;
        	left=right=null;
        }
    }
 
    Node root;
 
    BST(){
    	root= null;
    }
 
    BST(int value){ 
    	root= new Node(value);
    }

    void insert(int key){ 
    	root= insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        if (root== null){
            root= new Node(key);
            return root;
        }
        else if (key<root.key)
            root.left= insertRec(root.left, key);
        else if (key>root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
 
    void inorder(){
    	inorderRec(root); 
    }
    
    void inorderRec(Node root){
        if (root!= null){
            inorderRec(root.left);
            System.out.print(root.key+ " ");
            inorderRec(root.right);
        }
    }
    
    Node search(Node root, int key) {
        if (root==null||root.key==key)
            return root;
        if (root.key<key)
            return search(root.right, key);
        
        return search(root.left, key);
    }
    
    Node deleteNode(Node root, int key) {
    	if(root==null)
    		return root;
    	if(root.key>key) {
    		return root.left=deleteNode(root.left,key);
    		
    	}
		return  search(root.left, key);
    }
 
    public static void main(String[] args){
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        tree.inorder();
        System.out.println();
        
        int key=6;
        if (tree.search(tree.root,key)==null)
            System.out.println(key+ " not found");
        else
            System.out.println(key+ " found");

        key=60;
        if (tree.search(tree.root, key) == null)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found");
    }
}

//                      OTHERWISE................

//import AssQ.BinarySearchTree.Node;
/*public class BinarySearchTree {
	class Node{
		int key;
		Node right,left;
		public Node(int key) {
			this.key=key;
			left=right=null;
		}
	}
	
	Node root;
	BinarySearchTree(){
		root=null;
	}
	
	BinarySearchTree(int  value){
		root=new Node(value);
	}
	
	void insert(int key) {
		root=insert(root,key);
	}
	
	Node insert(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		else if(key<root.key){
			root.left=insert(root.left,key);
		}
		else if(key>root.key) {
			root.right=insert(root.right,key);
		}
		return root;
	}
	
	void inorder() {
		inorder(root);
	}
	
	void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}
	
	Node search(Node root,int key) {
		if(root==null||root.key==key)
			return root;
		if(root.key<key)
			return search(root.right,key);
		else
			return search(root.left,key);
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(9);
		bst.insert(79);
		bst.insert(48);
		bst.insert(21);
		bst.insert(24);
		bst.inorder();
		System.out.println();
		if(bst.search(bst.root, 24)==null)
			System.out.println("Not found");
		else
			System.out.println("Found");

	}

}     */
/*
 * 
 * 
class node {
	int data;
	node left;
	node right;
	public node(int data) {
		super();
		this.data=data;
	}
	@Override
	public String toString() {
		return "node [data=" + data + "]";
	}
	
}
public class Bst {
	node root;
	public void insert(int data) {
		root=recInsert(root,data);
	}
	
	public node recInsert(node root , int data) {
		if(root==null) {
			root= new node(data);
		}
		else if(root.data<data) {
			root.left=recInsert(root.left,data);
		}
		else if(root.data>data) {
			root.right=recInsert(root.right,data);
		}

		return root;
	}
	
	public void inorder() {
		root= recInorder(root);
	}
	

	public node recInorder(node root) {
		if(root!=null) {
			recInorder(root.right);
			System.out.println(root.data+ " ");
			recInorder(root.left);
		}
		return root;
	}
	
}
*/

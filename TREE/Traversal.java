class BSTNode{
	int info;
	BSTNode left;
	BSTNode right;
	public BSTNode(int info) {
		this.info = info;
	}
}
class BSTs{
	BSTNode root;
	public void insert(int data) {
		root=recInsert(root,data);
	}
	public BSTNode recInsert(BSTNode root,int data) {
		if(root==null) 
			root=new BSTNode(data);
		else if (data<root.info) 
			root.left=recInsert(root.left,data);
		else if(data>root.info) 
			root.right=recInsert(root.right,data);
		return root;
	}
	
	public void inorder(){
		recInorder(root);
	}
	public BSTNode recInorder(BSTNode root) {
		if(root!=null) {
			recInorder(root.left);
			System.out.println(root.info);
			recInorder(root.right);
		}
		return root;
	}
	
	public void preorder(){
		recPreorder(root);
	}
	public BSTNode recPreorder(BSTNode root) {
		if(root!=null) {
			System.out.println(root.info);
			recInorder(root.left);
			recInorder(root.right);
		}
		return root;
	}
	
	
	
	public void postorder(){
		recPostorder(root);
	}
	public BSTNode recPostorder(BSTNode root) {
		if(root!=null) {
			recInorder(root.left);
			recInorder(root.right);
			System.out.println(root.info);
		}
		return root;
	}
}


public class Traversal {

	public static void main(String[] args) {
		BSTs b = new BSTs ();
		b.insert(23);
		b.insert(67);
		b.insert(52);
		b.insert(9);
		b.insert(14);
		System.out.println("INORDER:- ");
		b.inorder();
		System.out.println("POSTORDER:- ");
		b.postorder();
		System.out.println("PREORDER:- ");
		b.preorder();

	}

}


/*
class Country {
    String name;
    int population;
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + '}';
    }
}
class BNode {
    Country info;
    BNode left, right;

    public BNode(Country info) {
        this.info = info;
        this.left = this.right = null;
    }
}
public class Traversal {
    BNode root;
    public Traversal() {
        root = null;
    }
    public void insert(Country info) {
        root = insertRec(root, info);
    }
    BNode insertRec(BNode root, Country info) {
        if (root == null) {
            root = new BNode(info);
            return root;
        }
        if (info.getPopulation() < root.info.getPopulation()) {
            root.left = insertRec(root.left, info);
        } else if (info.getPopulation() > root.info.getPopulation()) {
            root.right = insertRec(root.right, info);
        }
        return root;
    }
    
    public void inorderTraversal() {
        inorderRec(root);
    }
    
    void inorderRec(BNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.println(node.info);
            inorderRec(node.right);
        }
    }
    
    public void preorderTraversal() {
        preorderRec(root);
    }
    
    void preorderRec(BNode node) {
        if (node != null) {
            System.out.println(node.info);
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }
    
    public void postorderTraversal() {
        postorderRec(root);
    }
    
    void postorderRec(BNode node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.println(node.info);
        }
    }
    
    public Country findMax() {
        if (root == null) return null;

        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.info;
    }

    public Country findMin() {
        if (root == null) 
        	return null;

        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.info;
    }
    
    public static void main(String[] args) {
        Traversal bst = new Traversal();
        bst.insert(new Country("Japan",5600));
        bst.insert(new Country("Australia",208900));
        bst.insert(new Country("India",900000));
        bst.insert(new Country("Afghanistan",300000));
        bst.insert(new Country("Rome",6700000));
        System.out.println("In-order traversal:");
        bst.inorderTraversal();
        System.out.println();
        System.out.println("Pre-order traversal:");
        bst.preorderTraversal();
        System.out.println();
        System.out.println("Post-order traversal:");
        bst.postorderTraversal();
        System.out.println();
        System.out.println("Node with maximum population: " + bst.findMax());
        System.out.println("Node with minimum population: " + bst.findMin());
    }
}
*/

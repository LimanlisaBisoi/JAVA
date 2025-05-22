/*Write a menu driven Java Program using class, methods and reference variables, to construct
a singly linked list consisting of the following information in each node: student regd_no
(int), mark secured in a subject (float).
The class definition should be as follows.
class Node
{
 protected int regd_no;
 protected float mark;
protected Node next;
}
The prototype of the create method should be as follows.
public static void create(Node start)
Define the methods for each of the following operations to be supported by the above
linked list are:
a) The insertion operation
i. At the beginning of the list
Method Prototype: public static Node InsBeg(Node start)
ii. At the end of the list
Method Prototype: public static Node InsEnd(Node start)
iii. At any position in the list
Method Prototype: public static Node InsAny(Node start)
b) The deletion operation
i. From the beginning of the list
Method Prototype: public static Node DelBeg(Node start)
ii. From the end of the list
Method Prototype: public static Node DelEnd(Node start)
iii. From any position in the list
Method Prototype: public static Node DelAny(Node start)
iv. Deleting a node based on student regd_no. If the specified node is not present
in the list an error message should be displayed. Both the option should be
demonstrated.
c) Search a node based on student regd_no and update the mark of the student. If the
specified node is not present in the list an error message should be displayed.
Method Prototype: public static void search(Node start)
d) Sort the nodes of the linked list according to the mark secured by the student from
higher to lower.
Method Prototype: public static void sort(Node start)
e) Count the number of nodes present in the linked list
Method Prototype: public static int count(Node start)
f) Reverse the linked list
Method Prototype: public static Node reverse(Node start)
g) Displaying all the nodes in the list
The prototype of the display function should be as follows.
public static void display(Node start)
The template for menu driven java program to use the above list and invoke the required methods
to perform different operations is given below.
public class LinkedList
{
 public static void create(Node start)
{
 -------
 -----
}
 public static void display(Node start)
 {
 -----
 ------
 }                                                                   */
import java.util.*;
class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
  Node(int regd_no, float mark)
    {
        this.regd_no=regd_no;
        this.mark=mark;
        this.next=null;
    }
    public float getMark()
    {
        return mark;
    }
    public int getRegd_no()
    {
        return regd_no;
    }
  }
public class LinkedList {
    static Scanner obj = new Scanner(System.in);
    public  static Node create(Node start)
    {
             System.out.print("Enter Regd_no :");
             int rgno=obj.nextInt();
             System.out.print("Enter Marks :");
             float mark=obj.nextFloat();
             start = new Node(rgno,mark);
             System.out.println("Linkedlist created...");
             return start;
    }
    public static Node InsBeg(Node start)
    {
        if(start==null)
        {
            start=create(start);            
            return start;
        }
        else
        {
            System.out.print("Enter Regd_no : ");
            int r=obj.nextInt();
            System.out.print("Enter Marks : ");
            float m=obj.nextFloat();
            Node newNode = new Node(r,m);
            newNode.next=start;
            System.out.println("Node inserted at the beginning...");
            return newNode;
        }    
    }
    public static Node InsEnd(Node start)
    {
        if(start==null)
        {
            start=create(start);            
            return start;
        }
        else
        {
            System.out.print("Enter Regd_no : ");
            int r=obj.nextInt();
            System.out.print("Enter Marks : ");
            float m=obj.nextFloat();
            Node newNode = new Node(r,m);
            Node temp=start;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
            System.out.println("Node inserted at the end...");
            return start;
        }
    }
    public static Node InsAny(Node start)
    {       
        System.out.print("Enter the position to insert at: ");
        int position = obj.nextInt(); 
        Node temp = start;
        if(position==1)
        {
           return InsBeg(start);            
        }       
        else
        {
            for(int i=2;i<position;i++)
            {
                try{
                    temp = temp.next;
                    if(temp==null)
                        throw new NullPointerException();
                    }
                    catch(NullPointerException e)
                    {
                        System.out.println("Invalid position...");
                        return start;
                    }
            }
            System.out.print("Enter Regd_no : ");
            int r = obj.nextInt();
            System.out.print("Enter mark: ");
            float m = obj.nextFloat();
            Node newNode = new Node(r,m);      
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Node inserted at "+position+" position");
            return start;
        }
    }
    public static Node DelBeg(Node start)
    {
        if(start==null)
            System.out.println("Nothing in the list to delete...");
        else
        {
            start=start.next;
             System.out.println("Node deleted at the beginning...");
        }
            return start;

    }
    public static Node DelEnd(Node start)
    {
        if(start==null)
            System.out.println("Nothing in the list to delete...");
        else if (start.next == null) 
        {
        start = null;
        System.out.println("End Node deleted....");
        } 
        else 
        {
        Node temp = start;
        while (temp.next.next!= null) 
            temp = temp.next;
        temp.next=null;
        System.out.println("End Node deleted....");
        }
    return start;    
    }
    public static Node DelAny(Node start)
    {
        System.out.print("Enter the position to delete at: ");
        int position = obj.nextInt();
        if (position == 1) 
        {
            start=start.next;
             System.out.println("Node deleted at first position...");
            return start;
        }
        else 
        {
            Node temp = start;
            for(int i=2;i<position;i++)
            { 
                try{
                    temp = temp.next;
                    if(temp==null)
                        throw new NullPointerException();
                    }
                    catch(NullPointerException e)
                    {
                        System.out.println("Invalid position,Nothing to delete...");
                        return start;
                    }
            }
                Node jumper =temp;
                jumper=jumper.next;
                temp.next = jumper.next;
                System.out.println("Node deleted Successfully...");               
                return start;
        }
    }
    public static Node DelbyRegd(Node start) 
    {
        if (start == null) 
        {
            System.out.println("Linked list is empty..Nothing to delete.");
            return start;
        }
        System.out.print("Enter the regd_no of the node to delete: ");
        int regd_no = obj.nextInt();
        Node current = start;
        Node previous = null;
        if (start.regd_no == regd_no)
        {
           
            System.out.println("Node with regd_no " + regd_no + " deleted successfully.");
             return start.next;
        }
        boolean key=true;
        while (current != null) 
        {
            if (current.regd_no == regd_no) 
            {
                previous.next = current.next;
                current.next = null; 
                System.out.println("Node with regd_no " + regd_no + " deleted successfully.");
                key=false;
                return start;
            }
            previous = current;
            current = current.next;
        }
        try{
            if(key)
            throw new NullPointerException();
        }
        catch(NullPointerException e)
        {
            System.out.println("Node with regd_no " + regd_no + " not found in the list.");
        }
        return start;
    }
    public static void search(Node start)
    {
        if (start == null)
            System.out.println("List is empty. Nothing to search.");
        else
        {
            System.out.print("Enter the regd_no for search : ");
            float regd_no = obj.nextFloat();
            Node temp = start;
            boolean found = false;
            while (temp != null) 
            {
                if (temp.regd_no == regd_no) 
                {
                    System.out.print("Enter the new mark for the student: ");
                    float newMark = obj.nextFloat();
                    temp.mark = newMark;
                    System.out.println("Mark updated.....");
                    found = true;            
                }
                temp = temp.next;
            }    
                try
                {   
                    if(!found)                
                        throw new Exception("Not found any node having this regd_no...");
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }                
            }            
    }
    public static void sort(Node start)
    {        
        if (start==null)        
            System.out.println("Linked List is empty... ");
        else if(start.next==null)
            System.out.println("Linked list is sorted...");
        else
        {
            boolean swap;
            Node temp;
            Node lastNode=null;
            do 
            {
                swap = false;
                temp = start;
                while (temp.next != lastNode) 
                {
                    if (temp.mark < temp.next.mark) 
                    {
                        int tempRegdNo = temp.regd_no;
                        float tempMark = temp.mark;
                        temp.regd_no = temp.next.regd_no;
                        temp.mark = temp.next.mark;
                        temp.next.regd_no = tempRegdNo;
                        temp.next.mark = tempMark;
                        swap = true;
                    }
                    temp = temp.next;
                }
                lastNode = temp;
            } while (swap);
            System.out.println("Linked list sorted according to marks in Ascending order...");
        }

    }
    public static int count(Node start)     
    {   
        int count=0;
        Node temp=start;
        while(temp!=null)
        {
            count++;
            temp=temp.next;

        }
        return count;
    }
    public static Node reverse(Node start) 
    {
        Node reversed = null;
        Node present = start;
        Node hold;
        while (present != null) 
        {
            hold = present.next ;
            present.next = reversed;
            reversed = present;
            present = hold;
        }
        System.out.println("List reversed successfully!");
        return reversed;
    }
    public static void display(Node start)
    {  
        Node temp=start;  
        if(temp==null)
        {
        System.out.println("Empty link list...");
        }
        else
        {
        System.out.println("Regd.no\t\tMarks");     
        while(temp!=null)
        {
            System.out.println(temp.regd_no+"\t\t"+temp.mark);
            temp=temp.next;
        }
        System.out.println("All printed....");
        }
    }
    public static void main(String[] args) 
    {
        Node start=null;
            System.out.println("\n******** MENU ********");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at the beginning");
            System.out.println("4: Insert at the end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from the beginning");
            System.out.println("7: Delete from the end");
            System.out.println("8: Delete from any position");
            System.out.println("9:Delete by student regd_no.");
            System.out.println("10: Search and update mark");
            System.out.println("11: Sort the list");
            System.out.println("12: Count the number of nodes ");
            System.out.println("13: Reverse the Linked list");    
        while (true) 
        {
            System.out.print("\nEnter your choice: ");
            int choice = obj.nextInt();
            System.out.println();
             switch (choice) 
             {
                case 0:
                System.out.println("Thank you...\n Have a great day..");
                    System.exit(0);
                case 1:
                    start=create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    start=DelbyRegd(start);
                    break;
                case 10:
                    search(start);
                    break;
                case 11:
                    sort(start);
                    break;
                case 12:
                    System.out.println("Number of nodes in the list: " + count(start));
                    break;
                case 13:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice!...please enter a valid choice...");
                    break;
            }
        }
    }
}
/*                          OTHERWISE............
 import java.util.Scanner;
class Node {
	protected int regd_no;
	protected float mark;
	protected Node next;
}

public class LinkedList {
	static Scanner sc = new Scanner(System.in);
	public static Node create(Node start){
		Node newNode = new Node();
		System.out.print("Enter Regd_no: ");
	    newNode.regd_no = sc.nextInt();
	    System.out.print("Enter Marks: ");
	    newNode.mark = sc.nextFloat();	
	    if(start == null) {
	    	start = newNode;
	    } else {
	    	Node current = start;
	    	while(current.next != null) {
	    		current = current.next;
	    	}
	    	current.next = newNode;
	    }
	    return start;
	}
	
	public static void display(Node start) {
		if(start == null) {
			System.out.println("Linked list is empty.");
			return;
		}else {
			Node current = start;
			System.out.println("Position\tStudent Redg No.\tMark");
			int position = 1;
			while(current != null) {
				System.out.println(position + "\t\t" + current.regd_no + "\t\t\t" + current.mark);
				current = current.next;
				position++;
			}
		}
	}
	
	public static Node InsBeg(Node start) {
		Node newNode = new Node();
		System.out.print("Enter student registration number: ");
		newNode.regd_no = sc.nextInt();
		System.out.print("Enter mark secured in the subject: ");
		newNode.mark = sc.nextFloat();
		newNode.next = start;
		start = newNode;
		System.out.println("Node inserted at the beginning.");
		return start;
	}
	
	public static Node InsEnd(Node start) {
		Node newNode = new Node();
		System.out.print("Enter student registration number: ");
		newNode.regd_no = sc.nextInt();
		System.out.print("Enter mark secured in the subject: ");
		newNode.mark = sc.nextFloat();
		newNode.next = null;
		if(start == null) {
			start = newNode;
		} else {
		    Node current = start;
		    while(current.next != null) {
			    current = current.next;
		    }
		    current.next = newNode;
		    System.out.println("Node inserted at the end.");
		}
		return start;
	}
	
	public static Node InsAny(Node start) {
		Node newNode = new Node();
		System.out.print("Enter student registration number: ");
		newNode.regd_no = sc.nextInt();
		System.out.print("Enter mark secured in the subject: ");
		newNode.mark = sc.nextFloat();
		newNode.next = null;
		System.out.print("Enter the position where you want to insert the node: ");
		int position = sc.nextInt();
		if(position == 1) {
			newNode.next = start;
			start = newNode;
		} else {
		    Node current = start;
		    for(int i = 1; i < position -1 && current != null; i++) {
			    current = current.next;
		    }
		    if(current == null) {
			    System.out.println("Invalid position");
		    } else {
			    newNode.next = current.next;
			    current.next = newNode;
		    }
		 }
		return start;
	}
	
	public static Node DelBeg(Node start) {
		if(start == null) {
			System.out.println("Linked list is empty.No nodes to delete.");
		} else {
			start = start.next;
		}
		System.out.println("Node deleted from the beginning.");
		return start;
	}
	
	public static Node DelEnd(Node start) {
		if(start == null) {
			System.out.println("Linked list is empty.No nodes to delete.");
			return start;
		} else if(start.next == null) {
			start = null;
		} else {
			Node current = start;
			while(current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
		System.out.println("Node deleted from the end.");
		return start;
	}
	
	public static Node DelAny(Node start) {
		if(start == null) {
			System.out.println("Linked list is empty.No nodes to delete.");
			return start;
		} else {
			System.out.print("Enter the position of the node to delete: ");
		    int position = sc.nextInt();
		    if(position == 1) {
			    start = start.next;
		    } else {
		    	Node current = start;
			    Node prev = null;
			    int count = 1;
			    while(count < position && current != null) {
				    prev = current;
				    current = current.next;
				    count++;
			    }
			    if(current == null) {
				    System.out.println("Invalid position");
			    } else {
				    prev.next = current.next;
			    }
		    }
		}
		return start;
	}
	
	public static Node delByRegd(Node start) {
		System.out.print("Enter the registration number to delete the node: ");
		int regd_no = sc.nextInt();
		Node temp = start;
		Node prev = null;
		boolean found = false;
		while(temp != null) {
			if(temp.regd_no == regd_no) {
				found = true;
				if(prev == null) {
					start = temp.next;
				} else {
					prev.next = temp.next;
				}
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if(found) {
			System.out.println("Node with registration number " + regd_no + " deleted successfully.");
		} else {
			System.out.println("Node with registration number " + regd_no + " not found");
		}
		return start;
	}
	
	public static void search(Node start) {
		if(start == null) {
			System.out.println("Linked list is empty.");
		} else {
			System.out.print("Enter the student registration number to search: ");
		    int regd_no = sc.nextInt();
		    Node current = start;
		    boolean found = false;
		    while(current != null) {
			    if(current.regd_no == regd_no) {
			    	found = true;
				    System.out.print("Enter the new mark for the student: ");
				    current.mark = sc.nextFloat();
				    break;
			    }
			    current = current.next;
		    }
		    if(!found) {
			System.out.println("Student registration number not found.");
		    } else {
			    System.out.println("Mark updated successfully.");
		    }
		}
	}
	
	public static void sort(Node start) {
		if(start == null) {
			System.out.println("Linked list is empty.");
			return;
		} else {
			Node current = start;
			while(current != null) {
				Node index = current.next;
				while(index != null) {
					if(current.mark < index.mark) {
					    float tempMark = current.mark;
					    current.mark = index.mark;
					    index.mark = tempMark;
					    int tempRegdNo = current.regd_no;
					    current.regd_no = index.regd_no;
					    index.regd_no = tempRegdNo;
				    }
				    index = index.next;
				}
				current = current.next;
			}
		}
		System.out.println("Linked list is sorted successfully.");
	}
	
	public static int count(Node start) {
		int count = 0;
		Node current = start;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public static Node reverse(Node start) {
		if(start == null || start.next == null) {
			return start;
		}
		Node prev = null;
		Node current = start;
		Node nextNode = null;
		while(current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		start = prev;
		System.out.println("Linked list reversed.");
		return start;
	}
	public static void main(String[] args) {
		Node start = null;
		while(true) {
			System.out.println("****MENU*****");
			System.out.println("0: Exit");
			System.out.println("1: Creation");
			System.out.println("2: Display");
			System.out.println("3: Insert at the beginning");
			System.out.println("4: Insert at the end");
			System.out.println("5: Insert at any position");
			System.out.println("6: Delete from the beginning");
			System.out.println("7: Delete from the end");
			System.out.println("8: Delete from any position");
			System.out.println("9: Delete by registartion number");
			System.out.println("10: Search and update mark");
			System.out.println("11: Sort based on marks");
			System.out.println("12: Count number of nodes");
			System.out.println("13: Reverse the linked list");
			System.out.println();
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("****Exit*****");
				System.exit(0);
			case 1:
				start = create(start);
				System.out.println();
				break;
			case 2:
				display(start);
				System.out.println();
				break;
			case 3:
				start = InsBeg(start);
				System.out.println();
				break;
			case 4:
				start = InsEnd(start);
				System.out.println();
				break;
			case 5:
				start = InsAny(start);
				System.out.println();
				break;
			case 6:
				start = DelBeg(start);
				System.out.println();
				break;
			case 7:
				start = DelEnd(start);
				System.out.println();
				break;
			case 8:
				start = DelAny(start);
				System.out.println();
				break;
			case 9:
				start = delByRegd(start);
				System.out.println();
				break;
			case 10:
				search(start);
				System.out.println();
				break;
			case 11:
				sort(start);
				System.out.println();
				break;
			case 12:
				int nodeCount = count(start);
				System.out.println("Number of nodes in the linked list: " + nodeCount);
				System.out.println();
				break;
			case 13:
				start = reverse(start);
				System.out.println();
				break;
			default:
				System.out.println("Wrong choice");
				System.out.println();
			}
		}
	}
}                                                                  */
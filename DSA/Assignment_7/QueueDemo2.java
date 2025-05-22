/*Dynamic Implementation (Linked List Implementation)
A Queue is implemented dynamically by using a Linked list where each node in the
linked list has two parts, the data element and the reference to the next element
of the queue.The Queue elements can be integers, characters, strings or user 
defined types. There is no restriction on how big the Queue can grow.      */
import java.util.Scanner;
class Node {
	int info;
	Node next;
}
public class QueueDemo2 {
	static Scanner sc = new Scanner(System.in);
	
	public static Node insert(Node rear, Node front) {
		System.out.print("Enter element to insert: ");
		int element = sc.nextInt();
		Node newNode = new Node();
		newNode.info = element;
		newNode.next = null;
		
		if(rear == null || front == null) {
			rear = front = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		return front;
	}
	
	public static Node delete(Node rear, Node front) {
		if(front == null) {
			System.out.println("Queue is empty. Cannot delete.");
			//return null;
		} else {
			System.out.println("Deleted element: " + front.info);
			front = front.next;
		}
		return front;
	}
	
	public static void display(Node rear, Node front) {
		if(front == null) {
			System.out.println("Queue is empty");
			//return;
		} else {
			System.out.println("Queue elements:");
			Node temp = front;
			while(temp != null) {
				System.out.print(temp.info + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		
	}
	
	public static Node getRear(Node front) {
		if(front == null) {
			return null;
		} else {
			while(front.next != null) {
				front = front.next;
			}
			return front;
		}
	}
	public static void main(String[] args) {
		Node rear = null, front = null;
		while(true) {
			System.out.println("****MENU****");
			System.out.println("0: Exit");
			System.out.println("1: Insert");
			System.out.println("2: Delete");
			System.out.println("3: Display");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("****EXIT****");
				System.exit(0);
			case 1:
				front = insert(rear, front);
				rear = getRear(front);
				break;
			case 2:
				front = delete(rear, front);
				break;
			case 3:
				display(rear, front);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
/*                    OTHERWISE...........
 import java.util.*;
class Node<T> 
{
	T info;
	Node<T> next;
	Node(T info)
	{
		this.info=info;
		this.next=null;
	}
}
public class QueueDemo2<T> 
{
	public static <T> Node<T> insert(Node<T> rear, Node<T> front)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the value to insert in Queue : ");
        T element=(T) obj.next();
		Node n = new Node<T>(element);
		if(rear==null || front==null)
        {
			front =n;
            rear= n;
        }
		else
		{
			rear.next=n;
			rear=n;
		}
		return front;        
	}
	public static <T> Node<T> delete(Node<T> rear, Node<T> front)
	{
		if(front==null)
			System.out.println("Empty Queue,Nothing to Delete...");
		else
		{
            System.out.println(front.info+" is deleted...");
			front=front.next;
		}
		return front;
	}
	public static <T> void display(Node<T> rear, Node<T> front)
	{
		Node<T> n = front;
		if(n==null)
			System.out.println("Queue is Empty...");
		else
		{
			System.out.println("Elements of Queue are : ");
			while(n!=null)
			{
				System.out.print(n.info+" <- ");
				n=n.next;
			}
            System.out.println();
		}
	}
	public static<T> Node<T> getRear(Node<T> front)
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node<T> n = front;
			while(n.next!=null)
			{
				n=n.next;
            }
			return n;
		}
	}
    public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Node<Object> front=null, rear=null;
		
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0 : Exit");
			System.out.println("1 : Insert");
			System.out.println("2 : Delete");
			System.out.println("3 : Display");
			System.out.println("Enter your Choice: ");
			int choice=obj.nextInt();
			switch(choice)
			{
				case 0:
					System.exit(0);
                    System.out.println("Thank you...");
					break;
				case 1:
					front=insert(rear, front);
					rear=getRear(front);
					break;
				case 2:
					front=delete(rear, front);
					break;
				case 3:
					display(rear, front);
					break;
				default:
					System.out.println("Wrong Choice");
			}
		}
	}
}                                                                        */

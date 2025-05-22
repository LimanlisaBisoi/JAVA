import java.util.*;
class Node2
{
	int info;
	Node2 next;
	Node2(int info)
	{
		this.info=info;
		this.next=null;
	}
}
public class QueueDemo2WithoutGenerics 
{
	public static Node2 insert(Node2 rear, Node2 front)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the value to insert in Queue : ");
        int element= obj.nextInt();
		Node2 newnode = new Node2(element);
		if(rear==null || front==null)
        {
			front =newnode;
            rear= newnode;
        }
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		return front;        
	}
	public static Node2 delete(Node2 rear, Node2 front)
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
	public static void display(Node2 rear, Node2 front)
	{
		Node2 n = front;
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
	public static Node2 getRear(Node2 front)
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node2 n = front;
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
		Node2 front=null, rear=null;
		
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
}
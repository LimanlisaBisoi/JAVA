/*Dynamic Implementation (Linked List Implementation)
A stack is implemented dynamically by using a Linked list where each node in 
the linked list has two parts, the data element and the reference to the next 
element of the stack. */
import java.util.Scanner;
class Node1 {
	int info;
	Node1 next;
}
public class StackDemo2 {
	static Scanner sc = new Scanner(System.in);
	public static Node1 push(Node1 top) {
		System.out.print("Enter the element to push: ");
		int element = sc.nextInt();
		Node1 newNode = new Node1();
		newNode.info = element;
		newNode.next = top;
		top = newNode;
		System.out.println("Element pushed to the stack.");
		return top;
	}
	
	public static Node1 pop(Node1 top) {
		if(top == null) {
			System.out.println("Stack is empty. Cannot perform pop operation.");
		} else {
			System.out.println("Popped element: " + top.info);
			top = top.next;
		}
		return top;
	}
	
	public static void display(Node1 top) {
		if(top == null) {
			System.out.println("Stack is empty.");
		} else {
			Node1 temp = top;
			System.out.println("Stack elements:");
			int i = 1;
			while(temp != null) {
				System.out.println(i++ + ") " + temp.info);
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Node1 top = null;
		while(true) {
			System.out.println("****MENU****");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("****Exit****");
				System.exit(0);
				break;
			case 1:
				top = push(top);
				System.out.println();
				break;
			case 2:
				top = pop(top);
				System.out.println();
				break;
			case 3:
				display(top);
				System.out.println();
				break;
			default:
				System.out.println("Wrong choice");
				System.out.println();
			}
		}
	}
}
/*                           OTHERWISE..........            
import java.util.Scanner;
public class StackDemo2 
{
    static Scanner obj = new Scanner(System.in);
    static class Node<T> 
    {
        T info;
        Node<T> next;
        Node(T element) 
        {
            info = element;
            next = null;
        }
    }
    public static <T> Node<T> push(Node<T> top) 
    {        
        System.out.println("Enter the value:");
        T element = (T) obj.next();
        Node newNode=new Node<T>(element);
        newNode.next=top;
        top=newNode;
        return top;
    }
    public static <T> Node<T> pop(Node<T> top) 
    {
        if (top == null) 
            System.out.println("Stack is empty...can't pop any element now");
        else 
        {
            System.out.println("Element " + top.info + " is popped from the stack...");
            top = top.next;
        }
        return top;
    }
    public static <T> void display(Node<T> top) 
    {
        if (top == null)
            System.out.println("Stack is empty , Nothing to display.");
        else 
        {
            Node<T> current = top;
            System.out.print("Stack elements are :\n");
            int i=1;
            while (current != null) 
            {
                System.out.println(i++ +" ->"+current.info);
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Node<Object> top = null;
        while (true) 
        {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = obj.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top=push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}*/
/*Static Implementation (Array Implementation)
A stack is implemented statically by using an array of size MAX to hold stack 
elements and an integer top storing the position of top of the stack. The stack
elements can be integers, characters, strings or user defined data types.    */
import java.util.Scanner;
public class StackDemo1 {
	static Scanner sc = new Scanner(System.in);
	public static final int MAX = 10;
	
	public static int push(int S[], int top) {
		if(isFull(top)) {
			System.out.println("Stack Overflow");
			return top;
		}
		System.out.print("Enter the element to push: ");
		int element = sc.nextInt();
		S[++top] = element;
		System.out.println("Element pushed successfully");
		return top;
	}
	
	public static int pop(int S[], int top) {
		if(isEmpty(top)) {
			System.out.println("Stack Underflow");
			return top;
		}
		System.out.println("Popped element: " + S[top--]);
		return top;
	}
	
	public static void display(int S[], int top) {
		if(isEmpty(top)) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Stack elements: ");
		for(int i = top; i >= 0; i--) {
			System.out.println(S[i]);
		}
	}
	
	public static boolean isEmpty(int top) {
		return (top == -1);
	}
	
	public static boolean isFull(int top) {
		return (top == MAX - 1);
	}

	public static void main(String[] args) {
		int stack[] = new int[MAX];
		int top = -1;
		while(true) {
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("****EXIT****");
					System.exit(0);
				case 1:
					top = push(stack, top);
					System.out.println();
					break;
				case 2:
					top = pop(stack, top);
					System.out.println();
					break;
				case 3:
					display(stack, top);
					System.out.println();
					break;
				default:
					System.out.println("Invalid choice");
					System.out.println();
			}
		}
	}
}
/*                      OTHERWISE..............
import java.util.*;
public class StackDemo1
{
    public static int push(Object[] S, int top) 
    {
        if (isFull(top))
            System.out.println("Stack is already full...Can't push anymore");
        else 
        {
            System.out.print("Enter the element : ");
            Object element = (Object) obj.next();
            S[++top]=element;
        }
        return top;
    }
    public static int pop(Object[] S, int top) 
    {
        if (isEmpty(top))    
            System.out.println("Stack is empty...can't pop any element now"); 
        else
            System.out.println("Element "+ S[top--]+" is popped from the stack...");
        return top;
    }
    public static void display(Object[] S, int top) 
    {
        if (isEmpty(top)) 
            System.out.println("Stack is empty. Nothing to display.");
        else 
        {
            System.out.println("Stack elements are :");
            for (int i = top; i >= 0; i--)
                System.out.println(S[i]);
        }
    }
    public static boolean isEmpty(int top) 
    {
        return (top == -1);
    }
    public static boolean isFull(int top) 
    {
        return top == MAX - 1;
    }
    public static final int MAX = 10;
    static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Object[] stack = new Object[MAX];
        int top = -1;
        while (true)
        {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice =obj.nextInt();
            switch (choice) 
            {
                case 0:
                    System.out.println("Thank you...Have a Great day...");
                    System.exit(0);
                break;
                case 1:
                    top=push(stack, top);
                    break;
                case 2:
                    top=pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice...");
                    break;
            }
        } 
    }
}*/

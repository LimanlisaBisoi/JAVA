/*Static Implementation (Array Implementation)
A Queue is implemented statically by using an array of size MAX to hold the 
elements and it has two ends (integers) – front and rear. The ‘front’ stores the
position of the current front element and ‘rear’ stores the position of the 
current rear element of the queue. The Queue elements can be integers, characters,
strings or user defined data types.                                           */
import java.util.Scanner;
public class QueueDemo1 {
	static Scanner sc = new Scanner(System.in);
	public static final int MAX = 5;
    static int front = -1;
    static int rear = -1;

    public static boolean isEmpty() {
        return rear == -1 & front == -1;
    }

    public static boolean isFull() {
        return rear == MAX-1;
    }

    public static void insert(int Q[]) {
        if(isFull()) {
            System.out.println("Full queue");
        } else {
        	//1st element add
        	System.out.print("Enter the element to insert: ");
        	int element = sc.nextInt();
        	if(front == -1) {
        		front = 0;
        	}
        	Q[++rear] = element;
        	System.out.println("Element inserted successfully.");
        }
    }

    public static void delete(int Q[]) {
        if(isEmpty()) {
            System.out.println("Queue is empty. Deletion not possible.");
            return;
        }

        System.out.println("Deleted element: " + Q[front++]);
        if(front > rear) {
            rear = front = -1;
        }
    }

    public static void display(int Q[]) {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
        	System.out.println("Elements in the queue: ");
        	for(int i = front; i <= rear; i++) {
        		System.out.println(Q[i] + " ");
        	}
        	System.out.println();
        }
    }
	public static void   main(String[] args) {
		int queue[] = new int[MAX];
		
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
				insert(queue);
				break;
			case 2:
				delete(queue);
				break;
			case 3:
				display(queue);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
/*                     OTHERWISE............
import java.util.*;
public class QueueDemo1<T> 
{
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static <T> void insert(T Q[]) 
    {
        if (is_full()) 
        {
            System.out.println("Queue is full, Cannot insert element.");
            return;
        }
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        T element = (T) obj.next();
        if (is_empty())
            front = 0;
        Q[++rear] = element;
        System.out.println("Element " + element + " inserted successfully.");
    }
    public static <T> void delete(T Q[]) {
        if (is_empty()) 
        {
            System.out.println("Queue is empty, Cannot delete element...");
            return;
        }
         System.out.println("Element " + Q[front] + " deleted successfully.");
        if (rear == 0) 
            front =rear=-1;
        else 
        {
            for (int i = 1; i <=rear; i++)
                Q[i-1] = Q[i];
            rear--;
        }       
    }
    public static <T> void display(T Q[]) 
    {
        if (is_empty()) 
        {
            System.out.println("Queue is empty...Nothing to display");
            return;
        }
        System.out.println("Elements in the queue:");
        for (int i = front; i <= rear; i++) 
            System.out.print(Q[i] + " <- ");
        System.out.println();
    }
    public static boolean is_full() 
    {
        return rear == MAX - 1;
    }
    public static boolean is_empty() 
    {
        return front == -1;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Object queue[]=new Object[MAX];
        while (true) 
        {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = obj.nextInt();
            switch (choice) 
            {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}                                                              */
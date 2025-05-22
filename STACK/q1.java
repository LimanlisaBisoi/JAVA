
public class q1 {
    private int maxSize;
    private int top;
    private int[] stackArray;

    q1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public static void main(String[] args) {
        q1 stack = new q1(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

//                   OTHERWISE....................
/*//push
    public static Node push(Node top) {
        Node newNode = new Node();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to push: ");
        int value = sc.nextInt();
        newNode.info = value;
        newNode.next = top;
        top = newNode;
        return top;
    }
//pop
    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Node temp = top;
            top = top.next;
            return temp;
        }
    }
//display
    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            while (top != null) {
                System.out.print(top.info + " ");
                top = top.next;
            }
            System.out.println();
        }
    }
*/

/*public class StackDemo1 {
    public static int MAX = 10;
    
    //push array
    public static int push(int[] S, int top) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        if (isFull(top)) {
            System.out.println("Stack is full");
            return -1;
        } else {
            S[++top] = sc.nextInt();
            return top;
        }
    }
    
    
//pop
    public static int pop(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int x = S[top];
            top--;
            return x;
        }
    }
    
    
//display
    public static void display(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }
    */


import java.util.*;

public class q2 {
static void showpush(Stack<Integer> st, int a) {
st.push(a);
System.out.println("push(" + a + ")");
System.out.println("stack: " + st);
}

static void showpop(Stack<Integer> st) {
System.out.print("pop -> ");
Integer a = st.pop();
System.out.println(a);
System.out.println("stack: " + st);
}

public static void main(String args[]) {
Stack<Integer> st = new Stack<Integer>();
System.out.println("stack: " + st);
showpush(st, 42);
showpush(st, 66);
showpush(st, 99);
showpop(st);
showpop(st);
showpop(st);
try {
showpop(st);
} catch (EmptyStackException e) {
System.out.println("empty stack");
}
}
}

//                     OTERWISE................
/*import java.util.Stack;  
public class q2
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
}  
}  
*/

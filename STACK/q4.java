import java.util.*;
public class q4 {
	public static void showpush(Stack<Integer> st, int a) {
		st.push(a);
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
		}

	public static void showpop(Stack<Integer> st) {
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
		
		}

}

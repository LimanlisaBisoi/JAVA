package q10pack1;

import java.util.*;
public class Test extends Student {
	 public int mark1,mark2;
	 public void input() {
	 super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mark 1: ");
		mark1 = sc.nextInt();
		System.out.print("Enter Mark 2: ");
		mark2 = sc.nextInt();
		}
		
		public void output() {
			super.output();
			System.out.println("Mark 1: " + mark1);
			System.out.println("Mark 2: " + mark2);
		}
	}

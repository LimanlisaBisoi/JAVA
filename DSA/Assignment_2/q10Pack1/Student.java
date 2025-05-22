package q10pack1;

import java.util.Scanner;
public class Student {
	String name;  
	int roll;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter roll No.: ");
		roll = sc.nextInt();
	}
	
	public void output() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll);
	}

}


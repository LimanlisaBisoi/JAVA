/*Write a program to print the following outputs using for loops:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15                                                     */
public class Q6c {

	public static void main(String[] args) {
		int a=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				a++;
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}

/*Write a program to print the following outputs using for loops:
*
* *
* * *
* * * *
* * * * *                                                            */
public class Q6a{

	public static void main(String[] args) {
		for(int i = 1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

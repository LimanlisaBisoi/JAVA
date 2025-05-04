/*Write a program to print the following outputs using for loops:
A
A B
A B C
A B C D
A B C D E                                                     */
public class Q7a {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=65;j<=65+i;j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}

}
